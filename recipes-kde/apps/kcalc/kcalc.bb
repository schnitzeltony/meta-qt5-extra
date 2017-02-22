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
SRC_URI[md5sum] = "07b596a401713f006883e3bad5177510"
SRC_URI[sha256sum] = "002baf1330bdbd23771a607de11114bb9fe288dba14a3578a89e0c3cabd69e1e"

FILES_SOLIBSDEV = ""

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/kxmlgui5 \
    ${datadir}/kconf_update \
    ${libdir}/libkdeinit5_kcalc.so \
"

