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
SRC_URI[md5sum] = "7ab11372754dc0967e82f80dd1e6dff2"
SRC_URI[sha256sum] = "97e32590cd9078a2c8e5431aa9d4b1b7dd3b71bbeef4d053aa3afe976c1ab0cf"

FILES_${PN} += "${datadir}/kservicetypes5"
