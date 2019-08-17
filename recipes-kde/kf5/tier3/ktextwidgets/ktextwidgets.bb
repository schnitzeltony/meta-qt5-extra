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
SRC_URI[md5sum] = "0906bd87ee084c95c3bb012d1ad4b68f"
SRC_URI[sha256sum] = "a2fddad3dda750ea6bdb104c460e50586946ded3e1f46a8729dbd304016a0b5a"

FILES_${PN} += "${datadir}/kservicetypes5"
