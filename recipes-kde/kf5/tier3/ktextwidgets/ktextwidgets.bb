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
SRC_URI[md5sum] = "4071bcd54668bcb0977ad3af03ec9500"
SRC_URI[sha256sum] = "17af96f8fcc4dc67245d2d3c4d1c997dab8619a35599fb516c49f873ca4fa1ce"

FILES_${PN} += "${datadir}/kservicetypes5"
