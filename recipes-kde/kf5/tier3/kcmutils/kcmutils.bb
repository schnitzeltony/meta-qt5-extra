SUMMARY = "Utilities for working with KCModules"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gettext

DEPENDS += "kitemviews kconfigwidgets kcoreaddons ki18n kiconthemes kservice kxmlgui \
            kdeclarative kcoreaddons-native kauth-native kconfig-native kpackage-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "39aab4618037a06a9188f5b956e680cd"
SRC_URI[sha256sum] = "4fdf42bc02a02afab5fbdb5ed5e2328875030c78502b303621dca2f5ea27c140"

FILES_${PN} += "${datadir}/kservicetypes5"
