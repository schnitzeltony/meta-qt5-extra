SUMMARY = "Utilities for working with KCModules"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gettext

DEPENDS += "kitemviews kconfigwidgets kcoreaddons ki18n kiconthemes kservice kxmlgui \
            kdeclarative kcoreaddons-native kauth-native kconfig-native kpackage-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "5d2fa3bc71e4dbdf2a32e3b5f485bd02"
SRC_URI[sha256sum] = "f835e25d659f3ec96305e150649ca112c31a1b5f4937e5659a370b9832170870"

FILES_${PN} += "${datadir}/kservicetypes5"
