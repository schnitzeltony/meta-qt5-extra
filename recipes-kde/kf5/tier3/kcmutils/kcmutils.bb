SUMMARY = "Utilities for working with KCModules"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gettext

DEPENDS += "kitemviews kconfigwidgets kcoreaddons ki18n kiconthemes kservice kxmlgui \
            kdeclarative kcoreaddons-native kauth-native kconfig-native kpackage-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "e827a288ca377e94c1141858d3b72bbf"
SRC_URI[sha256sum] = "7468a2dddcfc3dde91898f76585d66f1d2620b2c341c4b6c85de16bea403a5ff"

FILES_${PN} += "${datadir}/kservicetypes5"
