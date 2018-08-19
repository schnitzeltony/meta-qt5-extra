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
SRC_URI[md5sum] = "012e92d2f2ce4574d2d3d0dbddc748af"
SRC_URI[sha256sum] = "81eb2c1832c2fb013565ed019c9a9d55ca3b0472967e28eee4aef25ba1a6ec91"

FILES_${PN} += "${datadir}/kservicetypes5"
