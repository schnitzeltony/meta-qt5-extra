SUMMARY = "KDE's calculator application"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-apps

DEPENDS += "\
    gmp \
    kconfig \
    kconfigwidgets \
    kdoctools \
    kguiaddons \
    ki18n \
    kinit \
    knotifications \
    kxmlgui \
" 

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "24c50e37604ca147d68cec4129e6e931"
SRC_URI[sha256sum] = "86723d1856d95206d557d3032c2c4872c6c6c3727ddfb7008dd1c8e89c5ffadd"

FILES_SOLIBSDEV = ""

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/kxmlgui5 \
    ${datadir}/kconf_update \
    ${libdir}/libkdeinit5_kcalc.so \
"

