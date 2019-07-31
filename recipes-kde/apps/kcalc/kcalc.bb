SUMMARY = "KDE's calculator application"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-apps gettext

DEPENDS += "\
    gmp \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kdoctools-native \
    kconfigwidgets \
    kguiaddons \
    ki18n \
    kinit \
    knotifications \
    kxmlgui \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "5d3f9b88e8396bedf0f2b276ac945157"
SRC_URI[sha256sum] = "42da5439af4f59402d27f2c48d4ee9c68d4a84bfda8d16a5ab9d7ab6bdcc02d5"

FILES_SOLIBSDEV = ""

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/kxmlgui5 \
    ${datadir}/kconf_update \
    ${libdir}/libkdeinit5_kcalc.so \
"

