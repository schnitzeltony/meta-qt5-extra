SUMMARY = "Utilities for working with KCModules"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gettext

DEPENDS += "kitemviews kconfigwidgets kcoreaddons ki18n kiconthemes kservice kxmlgui \
            kdeclarative kcoreaddons-native kauth-native kconfig-native kpackage-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "7af955e653262eac715df202e8418d90"
SRC_URI[sha256sum] = "223f658e1613fe886d49e7e540b0ef5c510ebaf9a7f7a201b89e98990aea50b7"

FILES_${PN} += "${datadir}/kservicetypes5"
