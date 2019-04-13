SUMMARY = "Utilities for working with KCModules"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gettext

DEPENDS += "kitemviews kconfigwidgets kcoreaddons ki18n kiconthemes kservice kxmlgui \
            kdeclarative kcoreaddons-native kauth-native kconfig-native kpackage-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "8863d6867d344e85295220f7fb8fc8b6"
SRC_URI[sha256sum] = "f3ee63a356e18be95a15141346356f3f43bb067d0326021d99f4b73ee4716fbb"

FILES_${PN} += "${datadir}/kservicetypes5"
