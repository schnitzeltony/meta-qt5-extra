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
SRC_URI[md5sum] = "b919c30021bff3bc09c105ddcaa0c7f6"
SRC_URI[sha256sum] = "5d816ce545debb63deb084a5bb2160bd9330874da1f347764a3e0c68462d4df1"

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
