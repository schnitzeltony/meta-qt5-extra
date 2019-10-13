SUMMARY = "Utilities for working with KCModules"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gettext

DEPENDS += "kitemviews kconfigwidgets kcoreaddons ki18n kiconthemes kservice kxmlgui \
            kdeclarative kcoreaddons-native kauth-native kconfig-native kpackage-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "a0b340e1b133ec97a9265e777885ebc7"
SRC_URI[sha256sum] = "c8bc32268307656b73aaa9c5c28ba05c92bd5e8a85eaab1772a2e6e774b222e0"

FILES_${PN} += "${datadir}/kservicetypes5"
