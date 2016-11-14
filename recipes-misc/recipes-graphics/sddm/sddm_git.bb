SUMMARY = "SDDM is a modern display manager for X11"
LICENSE = "GPLv2 & CC-BY-3.0"
LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=4641e94ec96f98fabc56ff9cc48be14b \
    file://LICENSE.CC-BY-3.0;md5=36b7342d5619a3a0d3b581e89803ec25 \
"

REQUIRED_DISTRO_FEATURES = "x11"

inherit cmake_qt5 cmake_extra_sanity pkgconfig systemd useradd distro_features_check

DEPENDS += "extra-cmake-modules-native qtbase qtdeclarative qttools libxcb"
# REVISIT optionals
DEPENDS += "libpam"

# Note: we should check default config changes by running sddm --example-config on target.
# This is usually done during build but does not work for our cross environment
SRC_URI = " \
    git://github.com/sddm/${BPN}.git;protocol=git;branch=master \
    file://0001-fix-qml-install-dir.patch \
    file://0002-do-not-create-example-configutation-we-cannot-run-sd.patch \
    file://0003-autologin-try-last-successful-session-if-no-autologi.patch \
    file://sddm.pam \
    file://sddm-autologin.pam \
    file://sddm.conf \
"
SRCREV = "43c900569081cdbf889c88c08c631888b56c4a8e"
PV = "0.14.0"

S = "${WORKDIR}/git"

EXTRA_OECMAKE += "-DQML_INSTALL_DIR=${OE_QMAKE_PATH_QML}"

do_configure_append() {
    # fix sysroot path
    sed -i 's:${STAGING_DIR_NATIVE}.*${libdir}:${libdir}:g' ${B}/src/common/Constants.h
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
    xauth \
    qtbase-plugins \
    qtdeclarative-plugins \
    qtdeclarative-qmlplugins \
    pam-plugin-tally \
"

