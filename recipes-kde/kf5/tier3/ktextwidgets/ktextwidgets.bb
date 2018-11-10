SUMMARY = "Advanced text editing widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcompletion kconfig kconfigwidgets ki18n kiconthemes kservice kwidgetsaddons \
            kwindowsystem sonnet kconfig-native kcoreaddons-native kauth-native \
            gettext-native sonnet-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "d492e3ab4b762d3fb9f431f2842f68c1"
SRC_URI[sha256sum] = "f1de7662ed95c99bcd665aa8033b884a7e5315c2f3ba3825a12b92ce157579e1"

FILES_${PN} += "${datadir}/kservicetypes5"
