SUMMARY = "Utilities for working with KCModules"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gettext

DEPENDS += "kitemviews kconfigwidgets kcoreaddons ki18n kiconthemes kservice kxmlgui \
            kdeclarative kcoreaddons-native kauth-native kconfig-native kpackage-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "b15758b0500e97866ea4b32dd042ae39"
SRC_URI[sha256sum] = "388587f864352e98670c41a9fb615cc6580c42b2b026041a341202976e4a6877"

FILES_${PN} += "${datadir}/kservicetypes5"
