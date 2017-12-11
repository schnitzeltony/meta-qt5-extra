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
SRC_URI[md5sum] = "b0f13d0727924a002fb3da6ba51b9b5e"
SRC_URI[sha256sum] = "7608a9f6b44acf2c9fbd483605dfd65004cce321ea0177909f8a6d69c126d654"

FILES_${PN} += "${datadir}/kservicetypes5"
