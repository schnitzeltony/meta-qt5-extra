SUMMARY = "Utilities for working with KCModules"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gettext

DEPENDS += "kitemviews kconfigwidgets kcoreaddons ki18n kiconthemes kservice kxmlgui \
            kdeclarative kcoreaddons-native kauth-native kconfig-native kpackage-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "4595a7fde0edebb72bd109f377b1622e"
SRC_URI[sha256sum] = "b11bbabdb11c205bdf7419e7a397555dd769353ffe217182d2c187f98e3142b3"

FILES_${PN} += "${datadir}/kservicetypes5"
