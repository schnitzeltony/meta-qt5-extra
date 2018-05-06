SUMMARY = "SDDM is a modern display manager for X11"
LICENSE = "GPLv2 & CC-BY-3.0"
LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=4641e94ec96f98fabc56ff9cc48be14b \
    file://LICENSE.CC-BY-3.0;md5=36b7342d5619a3a0d3b581e89803ec25 \
"

REQUIRED_DISTRO_FEATURES = "x11"

inherit cmake_qt5_extra qmake5_base pkgconfig systemd useradd distro_features_check

DEPENDS += "extra-cmake-modules-native qtbase qtdeclarative qttools libxcb"
# REVISIT optionals
DEPENDS += "libpam"

# Note: we should check default config changes by running sddm --example-config on target.
# This is usually done during build but does not work for our cross environment
SRC_URI = " \
    git://github.com/sddm/${BPN}.git;protocol=git;branch=master \
    file://0001-fix-qml-install-dir.patch \
    file://0002-do-not-create-example-configutation-we-cannot-run-sd.patch \
    file://0001-Fix-build-with-Qt-5.11-1024.patch \
    file://sddm.pam \
    file://sddm-autologin.pam \
    file://sddm.conf \
"
SRCREV = "a15888b04dee1c3194b1b81b7660b6e0f5ebdb43"
PV = "0.17.0"

S = "${WORKDIR}/git"

EXTRA_OECMAKE += "-DQML_INSTALL_DIR=${OE_QMAKE_PATH_QML}"

do_configure_append() {
    # fix sysroot path
    sed -i 's:${STAGING_DIR_HOST}.*${libdir}:${libdir}:g' ${B}/src/common/Constants.h
}

do_install_append() {
    install -d ${D}/${sysconfdir}
    install -m 644 ${WORKDIR}/sddm.conf ${D}/${sysconfdir}

    install -d ${D}${sysconfdir}/pam.d
    install -m 644 ${WORKDIR}/sddm.pam ${D}${sysconfdir}/pam.d/sddm
    install -m 644 ${WORKDIR}/sddm-autologin.pam ${D}${sysconfdir}/pam.d/sddm-autologin

    install -d ${D}${localstatedir}/lib/sddm
    chown -R sddm:sddm ${D}${localstatedir}/lib/sddm
    chmod 0750 ${D}${localstatedir}/lib/sddm
}

FILES_${PN} += "${OE_QMAKE_PATH_QML}"

SYSTEMD_SERVICE_${PN} = "${BPN}.service"

USERADD_PACKAGES = "${PN}"
USERADD_PARAM_${PN} = "--system --home ${localstatedir}/lib/sddm --shell /bin/false --user-group --groups video sddm"

RDEPENDS_${PN} += " \
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
    pam-plugin-tally \
"
