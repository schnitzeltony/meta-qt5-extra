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
SRC_URI[md5sum] = "02de175db32d27a21c9a74bf17643775"
SRC_URI[sha256sum] = "0d0d615da32c08c35685983f7cceeb01c4d3210e6ecc13c1ab154b2000421489"

FILES_${PN} += "${datadir}/kservicetypes5"
