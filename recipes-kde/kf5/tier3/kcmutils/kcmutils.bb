SUMMARY = "Utilities for working with KCModules"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gettext

DEPENDS += "kitemviews kconfigwidgets kcoreaddons ki18n kiconthemes kservice kxmlgui \
            kdeclarative kcoreaddons-native kauth-native kconfig-native kpackage-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "1fe4198573ec914521b8fefee112db09"
SRC_URI[sha256sum] = "bfc6a8e8d420c276474805949b8f4ab0c298b8de70827b6f0b342f434af6c421"

FILES_${PN} += "${datadir}/kservicetypes5"
