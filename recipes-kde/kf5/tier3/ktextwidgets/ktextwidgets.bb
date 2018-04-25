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
SRC_URI[md5sum] = "3193c51aa1d15fd588c30e232a365f39"
SRC_URI[sha256sum] = "4b406a084b4d33d635b0f4bcd33e752e9adc5d3726ddfa770ecb5401ecc6e6e4"

FILES_${PN} += "${datadir}/kservicetypes5"
