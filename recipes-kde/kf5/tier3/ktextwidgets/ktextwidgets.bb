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
SRC_URI[md5sum] = "a27bdd565993a82476393a7d840bb851"
SRC_URI[sha256sum] = "fe21e79b4882726a51c3c42f46dc379a940cb2b5a75ad8c51533d6a482ebab40"

FILES_${PN} += "${datadir}/kservicetypes5"
