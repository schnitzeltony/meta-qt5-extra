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
SRC_URI[md5sum] = "21ccdcec5a0377defc35360d33fa4b3a"
SRC_URI[sha256sum] = "8afb6e8178ecc45cbeb054b26ad1e4b928eccd61d6b0d883d7abd650fd031c2d"

FILES_${PN} += "${datadir}/kservicetypes5"
