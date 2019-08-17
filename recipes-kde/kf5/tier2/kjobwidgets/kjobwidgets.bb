SUMMARY = "Widgets for tracking KJob instances"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcoreaddons kcoreaddons-native kwidgetsaddons \
            ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "fa63977264e16079fd69c694ef61122e"
SRC_URI[sha256sum] = "5246c2a230e3b4e9d7ba87c5a6b13b5f96fef6af0d1262f27f91fa0c619cf378"

FILES_${PN} += "${datadir}/dbus-1"
