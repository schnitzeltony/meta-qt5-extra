SUMMARY = "Utilities for working with KCModules"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gettext

DEPENDS += "kitemviews kconfigwidgets kcoreaddons ki18n kiconthemes kservice kxmlgui \
            kdeclarative kcoreaddons-native kauth-native kconfig-native kpackage-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "8e1f8ac1320b01c9f894eb4ae22452ae"
SRC_URI[sha256sum] = "1a5aed5511e867117636b368fb91a5ff99280d7b0fe396e64ce66c06262cab98"

FILES_${PN} += "${datadir}/kservicetypes5"
