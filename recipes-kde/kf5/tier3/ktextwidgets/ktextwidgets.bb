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
SRC_URI[md5sum] = "dfb02e67153fdb240d929a7b44a5f50c"
SRC_URI[sha256sum] = "d9eb46747c0f2d4d4db5ac20c788b8894d2f7048f530b31c892c7bb44d2388a7"

FILES_${PN} += "${datadir}/kservicetypes5"
