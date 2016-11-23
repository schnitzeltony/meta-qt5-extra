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
SRC_URI[md5sum] = "a5c0e4c24e2fd48e30a37e608082442f"
SRC_URI[sha256sum] = "bfe14f27c952d10fad80733f74cd3926818241a5353dde30c4c29ae9f60c7e16"

FILES_SOLIBSDEV = ""

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/kxmlgui5 \
    ${datadir}/kconf_update \
    ${libdir}/libkdeinit5_kcalc.so \
"

