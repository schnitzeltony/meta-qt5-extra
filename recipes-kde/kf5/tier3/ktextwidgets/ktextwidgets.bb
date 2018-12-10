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
SRC_URI[md5sum] = "41089d37d64582213161d5ea55833afa"
SRC_URI[sha256sum] = "aced892ccc071a5420189528fb9b9609d094d6d6eb450385a98d9f5b4f0fbf08"

FILES_${PN} += "${datadir}/kservicetypes5"
