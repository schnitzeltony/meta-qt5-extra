SUMMARY = "Utilities for working with KCModules"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gettext

DEPENDS += "kitemviews kconfigwidgets kcoreaddons ki18n kiconthemes kservice kxmlgui \
            kdeclarative kcoreaddons-native kauth-native kconfig-native kpackage-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "8c408da1f427b049b742821b72f4bee5"
SRC_URI[sha256sum] = "f55938c566669e9fcdd786ebfd89edfc11b0c283532aed04cfe4162b58a8b649"

FILES_${PN} += "${datadir}/kservicetypes5"
