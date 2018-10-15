SUMMARY = "Utilities for working with KCModules"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gettext

DEPENDS += "kitemviews kconfigwidgets kcoreaddons ki18n kiconthemes kservice kxmlgui \
            kdeclarative kcoreaddons-native kauth-native kconfig-native kpackage-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "fd914e7559710808a2f7c1de0ad669e5"
SRC_URI[sha256sum] = "c838d4671e87314897da62c62d3663d97e38ecb560fd5bf922a5806f7d611305"

FILES_${PN} += "${datadir}/kservicetypes5"
