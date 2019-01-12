SUMMARY = "Utilities for working with KCModules"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gettext

DEPENDS += "kitemviews kconfigwidgets kcoreaddons ki18n kiconthemes kservice kxmlgui \
            kdeclarative kcoreaddons-native kauth-native kconfig-native kpackage-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "e246ab7bdaa0f83dd392655de3d4cdab"
SRC_URI[sha256sum] = "90b3f65e9adcd004b4b3770fb2bd66e4979d243801990bd90ed4db236afab228"

FILES_${PN} += "${datadir}/kservicetypes5"
