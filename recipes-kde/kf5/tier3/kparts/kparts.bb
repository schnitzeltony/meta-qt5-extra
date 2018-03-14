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
SRC_URI[md5sum] = "9857df9b94994ea1807a88215edd729f"
SRC_URI[sha256sum] = "4cbd5ba527f78f6942e40f1f65548b9207db937cd039dbe07aa1598bfc096e2d"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/kdevappwizard \
    ${OE_QMAKE_PATH_PLUGINS} \
"
FILES_${PN}-dbg += "${OE_QMAKE_PATH_PLUGINS}/.debug"
