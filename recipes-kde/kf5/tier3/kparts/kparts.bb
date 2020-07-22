SUMMARY = "Document centric plugin system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gettext

DEPENDS += " \
    kconfig \
    kconfig-native \
    kcoreaddons \
    kcoreaddons-native \
    ki18n \
    kiconthemes \
    kio \
    kjobwidgets \
    knotifications \
    kservice \
    ktextwidgets \
    kwidgetsaddons \
    kxmlgui \
    kauth-native \
    sonnet-native \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "4e9608b737f75d3cb082f5ae319dfa58"
SRC_URI[sha256sum] = "f1161f3cafd37e154d5f0bea74602c8b1d441c12e1a87c63d4e6aa132d1a1cbb"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/kdevappwizard \
    ${OE_QMAKE_PATH_PLUGINS} \
"
