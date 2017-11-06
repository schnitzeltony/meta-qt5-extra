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
SRC_URI[md5sum] = "795f2892fa9c630a6c22720a8f60a10c"
SRC_URI[sha256sum] = "5849d104e99be94d554bff229646df8fde84e3396c82e21a3e390ee08b09d05c"

FILES_${PN} += "${datadir}/kservicetypes5"
