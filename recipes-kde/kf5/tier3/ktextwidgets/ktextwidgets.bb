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
SRC_URI[md5sum] = "2206e59799048291ac77573dc03509f6"
SRC_URI[sha256sum] = "854283daf844685513ffc150c2958f7f1a38aa9ed5050e09a1079d7eac1a9294"

FILES_${PN} += "${datadir}/kservicetypes5"
