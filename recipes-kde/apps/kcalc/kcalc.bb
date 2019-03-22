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
SRC_URI[md5sum] = "ddd1ca9dcdb7db22f8a011e525e99963"
SRC_URI[sha256sum] = "10b3ebb5efab3731e9f12a8632546685281179881b03aae98f96a2cdbd21f02f"

FILES_SOLIBSDEV = ""

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/kxmlgui5 \
    ${datadir}/kconf_update \
    ${libdir}/libkdeinit5_kcalc.so \
"

