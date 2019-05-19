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
SRC_URI[md5sum] = "1d030a5e1a52bac6528d39737d52ffb8"
SRC_URI[sha256sum] = "056601d7c1aa412a9628fae8eb6ca6cf51d0f0fab03345bb4be8e7072827fed7"

FILES_${PN} += "${datadir}/kservicetypes5"
