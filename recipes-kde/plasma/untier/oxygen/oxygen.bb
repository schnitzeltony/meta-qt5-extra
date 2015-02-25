SUMMARY = "OXYGEN"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde-plasma

DEPENDS += " \
    ki18n \
    kconfig \
    kguiaddons \
    kwidgetsaddons \
    kservice \
    kcompletion \
    frameworkintegration \
    kwindowsystem \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "libxcb qtx11extras", "", d)} \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "23c3bf8a581b2dfd72e3c1cbcc3712a4"
SRC_URI[sha256sum] = "3410400ff27884c2d86514623cf18b6676638cb407ccd93cda2a941889f049aa"

FILES_${PN} += " \
    ${datadir}/icons \
    ${datadir}/kstyle \
    ${datadir}/plasma \
    ${libdir}/plugins \
"

FILES_${PN}-dbg += " \
    ${libdir}/plugins/.debug \
    ${libdir}/plugins/*/.debug \
"
