SUMMARY = "Utilities for working with KCModules"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gettext

DEPENDS += "kitemviews kconfigwidgets kcoreaddons ki18n kiconthemes kservice kxmlgui \
            kdeclarative kcoreaddons-native kauth-native kconfig-native kpackage-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "c9f2b551f32221892d746feb9c6fc7f8"
SRC_URI[sha256sum] = "b8b79ef2f4513fbe5e4c61cf4726ed33b95efffabdd512fcc2dcff23c23cdfa7"

FILES_${PN} += "${datadir}/kservicetypes5"
