SUMMARY = "Utilities for working with KCModules"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gettext

DEPENDS += "kitemviews kconfigwidgets kcoreaddons ki18n kiconthemes kservice kxmlgui \
            kdeclarative kcoreaddons-native kauth-native kconfig-native kpackage-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "fbd1d8df73a230632252d22c9309d1c7"
SRC_URI[sha256sum] = "80375a266286ec20b2c035ad3a79fe7aa4fe0974156413e8d7a9c881a482e4b3"

FILES_${PN} += "${datadir}/kservicetypes5"
