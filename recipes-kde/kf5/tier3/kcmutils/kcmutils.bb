SUMMARY = "Utilities for working with KCModules"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gettext

DEPENDS += "kitemviews kconfigwidgets kcoreaddons ki18n kiconthemes kservice kxmlgui \
            kdeclarative kcoreaddons-native kauth-native kconfig-native kpackage-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "5afc45d52f95a7ffba330412982a7164"
SRC_URI[sha256sum] = "3bd8f7c3bc58d16a4e192729da67ea3ba4b3c19b535da5311f6d94ea86d59b2f"

FILES_${PN} += "${datadir}/kservicetypes5"
