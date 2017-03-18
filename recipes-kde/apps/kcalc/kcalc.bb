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
SRC_URI[md5sum] = "0ec0e3317d1b94b6d3980f912b92d964"
SRC_URI[sha256sum] = "f755b263339d89b3e1358b665000d81e816ef125c09f2376183080585af86e1a"

FILES_SOLIBSDEV = ""

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/kxmlgui5 \
    ${datadir}/kconf_update \
    ${libdir}/libkdeinit5_kcalc.so \
"

