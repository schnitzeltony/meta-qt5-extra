SUMMARY = "Utilities for working with KCModules"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gettext

DEPENDS += "kitemviews kconfigwidgets kcoreaddons ki18n kiconthemes kservice kxmlgui \
            kdeclarative kcoreaddons-native kauth-native kconfig-native kpackage-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "62046f1c778dbc0cb1d4cdf2964006c6"
SRC_URI[sha256sum] = "7b8edb638b71c4298946d8d9294e217c7c7165857081e504ff9f2bee2f284f77"

FILES_${PN} += "${datadir}/kservicetypes5"
