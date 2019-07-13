SUMMARY = "Utilities for working with KCModules"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gettext

DEPENDS += "kitemviews kconfigwidgets kcoreaddons ki18n kiconthemes kservice kxmlgui \
            kdeclarative kcoreaddons-native kauth-native kconfig-native kpackage-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "1348201acbc60eb0056f2212bb70c9d9"
SRC_URI[sha256sum] = "22226ca10caedc6021b966a26a45096f30837ca9eedcc97479e30f950abc7b8c"

FILES_${PN} += "${datadir}/kservicetypes5"
