SUMMARY = "SDDM is a modern display manager for X11"
LICENSE = "GPLv2 & CC-BY-3.0"
LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=4641e94ec96f98fabc56ff9cc48be14b \
    file://LICENSE.CC-BY-3.0;md5=36b7342d5619a3a0d3b581e89803ec25 \
"

REQUIRED_DISTRO_FEATURES = "x11"

inherit cmake_qt5_extra qmake5_base pkgconfig systemd useradd features_check

DEPENDS += "extra-cmake-modules-native qtbase qtdeclarative qttools libxcb"

PACKAGECONFIG ??= "${@bb.utils.filter('DISTRO_FEATURES', 'pam', d)}"
PACKAGECONFIG[pam] = "-DENABLE_PAM=ON, -DENABLE_PAM=OFF, libpam"

# Note: we should check default config changes by running sddm --example-config on target.
# This is usually done during build but does not work for our cross environment
SRC_URI = " \
    git://github.com/sddm/${BPN}.git;branch=master \
    file://0001-fix-qml-install-dir.patch \
    file://0002-Workaround-missing-sessions.patch \
    file://sddm.pam \
    file://sddm-autologin.pam \
    file://sddm.conf \
"
SRCREV = "de41b8ea555f2e42ba47d83530ad654ca708cf85"
PV = "0.18.1"

S = "${WORKDIR}/git"

EXTRA_OECMAKE += " \
    -DLOGIN_DEFS_PATH=${STAGING_DIR_HOST}${sysconfdir}/login.defs \
    -DQML_INSTALL_DIR=${OE_QMAKE_PATH_QML} \
"

do_configure:append() {
    # fix sysroot path
    sed -i 's:${STAGING_DIR_HOST}.*${libdir}:${libdir}:g' ${B}/src/common/Constants.h
}

install_pam() {
    install -d ${D}${sysconfdir}/pam.d
    install -m 644 ${WORKDIR}/sddm.pam ${D}${sysconfdir}/pam.d/sddm
    install -m 644 ${WORKDIR}/sddm-autologin.pam ${D}${sysconfdir}/pam.d/sddm-autologin
}

do_install:append() {
    install -d ${D}/${sysconfdir}/sddm.conf.d
    install -m 644 ${WORKDIR}/sddm.conf ${D}/${sysconfdir}/sddm.conf.d/00-default.conf

    install -d ${D}${localstatedir}/lib/sddm
    chown -R sddm:sddm ${D}${localstatedir}/lib/sddm
    chmod 0750 ${D}${localstatedir}/lib/sddm

    ${@bb.utils.contains('DISTRO_FEATURES', 'pam', 'install_pam', '', d)}
}

FILES:${PN} += "${OE_QMAKE_PATH_QML}"

SYSTEMD_SERVICE:${PN} = "${BPN}.service"

USERADD_PACKAGES = "${PN}"
USERADD_PARAM:${PN} = "--system --home ${localstatedir}/lib/sddm --shell /bin/false --user-group --groups video sddm"

RDEPENDS:${PN} += " \
    bash \
    packagegroup-core-x11-xserver \
    xinit \
    xauth \
    xmessage \
    xrdb \
    \
    qtbase-plugins \
    qtdeclarative-plugins \
    qtdeclarative-qmlplugins \
"

RRECOMMENDS:${PN += " \
    qtvirtualkeyboard-plugins \
    qtvirtualkeyboard-qmlplugins \
"
