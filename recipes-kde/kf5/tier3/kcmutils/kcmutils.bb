SUMMARY = "Utilities for working with KCModules"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gettext

DEPENDS += "kitemviews kconfigwidgets kcoreaddons ki18n kiconthemes kservice kxmlgui \
            kdeclarative kcoreaddons-native kauth-native kconfig-native kpackage-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "9507cf7bd35be9c5435302e41e2f7a99"
SRC_URI[sha256sum] = "7cf6a81818745852c38558160e3888bdd2a9bcce135aee53c3df99e939633ab8"

FILES_${PN} += "${datadir}/kservicetypes5"
