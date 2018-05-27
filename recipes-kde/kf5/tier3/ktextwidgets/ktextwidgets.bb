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
SRC_URI[md5sum] = "b95b19128aeef4a2e6b5a111ccb11b42"
SRC_URI[sha256sum] = "8e0798cbb87594d4a6cbb4e105607f8b7a1d8a0af68128c324d7e07299cad1ae"

FILES_${PN} += "${datadir}/kservicetypes5"
