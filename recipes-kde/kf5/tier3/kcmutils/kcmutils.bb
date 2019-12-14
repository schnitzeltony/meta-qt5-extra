SUMMARY = "Utilities for working with KCModules"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gettext

DEPENDS += "kitemviews kconfigwidgets kcoreaddons ki18n kiconthemes kservice kxmlgui \
            kdeclarative kcoreaddons-native kauth-native kconfig-native kpackage-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "b034dde9b34723ebab34e74499fc5adf"
SRC_URI[sha256sum] = "fbb525cb21afbf9752d171ceb333a805c40d4722b98da6fce0243e37b8398ec3"

FILES_${PN} += "${datadir}/kservicetypes5"
