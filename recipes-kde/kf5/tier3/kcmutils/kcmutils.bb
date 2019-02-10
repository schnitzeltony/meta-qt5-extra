SUMMARY = "Utilities for working with KCModules"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gettext

DEPENDS += "kitemviews kconfigwidgets kcoreaddons ki18n kiconthemes kservice kxmlgui \
            kdeclarative kcoreaddons-native kauth-native kconfig-native kpackage-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "b6903266cb40093a903e3f745c0b45dc"
SRC_URI[sha256sum] = "1368c1d4998db1a37cd377d0b991ff84e761272787d063cf912bf7db894189b8"

FILES_${PN} += "${datadir}/kservicetypes5"
