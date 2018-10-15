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
SRC_URI[md5sum] = "cd28e595645a25ba6e990441388ec2c1"
SRC_URI[sha256sum] = "63e9f5ea730044d905857961e2857c78bbe9119f804768bb17fbbd9370f7b7a0"

FILES_${PN} += "${datadir}/kservicetypes5"
