SUMMARY = "Utilities for working with KCModules"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gettext

DEPENDS += "kitemviews kconfigwidgets kcoreaddons ki18n kiconthemes kservice kxmlgui \
            kdeclarative kcoreaddons-native kauth-native kconfig-native kpackage-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "525ea283337f41ca2b4bdbe7ec001ffa"
SRC_URI[sha256sum] = "daa97920b230a11e06fe9bee0ac244327178703e79b89728730f7c95d093adb9"

FILES_${PN} += "${datadir}/kservicetypes5"
