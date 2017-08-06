SUMMARY = "Utilities for working with KCModules"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gettext

DEPENDS += "kitemviews kconfigwidgets kcoreaddons ki18n kiconthemes kservice kxmlgui \
            kdeclarative kcoreaddons-native kauth-native kconfig-native kpackage-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "40336bb5a8308148b492a899c293c1c6"
SRC_URI[sha256sum] = "df21667f6dae44707d13e51780ffe157fd0a29d4b946b14876a2a96633b32e66"

FILES_${PN} += "${datadir}/kservicetypes5"
