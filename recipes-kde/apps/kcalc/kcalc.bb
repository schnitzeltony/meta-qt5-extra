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
SRC_URI[md5sum] = "9200ffe5d8fb71627cbba99de0542741"
SRC_URI[sha256sum] = "ddbf18748c2869d955b255bca9dc7372695bd923b9addd62e26f3a42978d8df2"

FILES_SOLIBSDEV = ""

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/kxmlgui5 \
    ${datadir}/kconf_update \
    ${libdir}/libkdeinit5_kcalc.so \
"

