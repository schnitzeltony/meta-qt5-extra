SUMMARY = "Utilities for working with KCModules"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gettext

DEPENDS += "kitemviews kconfigwidgets kcoreaddons ki18n kiconthemes kservice kxmlgui \
            kdeclarative kcoreaddons-native kauth-native kconfig-native kpackage-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "6d1b34b9eda374ccd564339ceaddf0f4"
SRC_URI[sha256sum] = "27743a81e9aa48baac12bb844e48d3098250699122ed6040b1e3c50a5e8f276d"

FILES_${PN} += "${datadir}/kservicetypes5"
