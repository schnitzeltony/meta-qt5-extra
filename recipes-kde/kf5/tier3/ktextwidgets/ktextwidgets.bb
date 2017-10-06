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
SRC_URI[md5sum] = "dfbececfe3068ae4fde38d63e1fb0990"
SRC_URI[sha256sum] = "eef0847aa98489437784361a281a16cbd52b3ac8a1a83619c370078e96ea1288"

FILES_${PN} += "${datadir}/kservicetypes5"
