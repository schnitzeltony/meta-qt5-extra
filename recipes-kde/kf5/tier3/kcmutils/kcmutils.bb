SUMMARY = "Utilities for working with KCModules"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gettext

DEPENDS += "kitemviews kconfigwidgets kcoreaddons ki18n kiconthemes kservice kxmlgui \
            kdeclarative kcoreaddons-native kauth-native kconfig-native kpackage-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "e2fa0de3e4d52bebb434a72170831d9f"
SRC_URI[sha256sum] = "93fd9b7b97cb4488f2007a4f518159129f0caafc05a004be56c87dd355870b1b"

FILES_${PN} += "${datadir}/kservicetypes5"
