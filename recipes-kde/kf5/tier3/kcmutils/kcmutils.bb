SUMMARY = "Utilities for working with KCModules"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gettext

DEPENDS += "kitemviews kconfigwidgets kcoreaddons ki18n kiconthemes kservice kxmlgui \
            kdeclarative kcoreaddons-native kauth-native kconfig-native kpackage-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "8ba187f0628de7b54122933aba23f74f"
SRC_URI[sha256sum] = "a688d54286fe11b23e11e2100536a513a332d2a7d784fcbebeaccbfb980d83d1"

FILES_${PN} += "${datadir}/kservicetypes5"
