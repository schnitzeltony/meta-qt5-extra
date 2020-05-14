SUMMARY = "Widgets for tracking KJob instances"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcoreaddons kcoreaddons-native kwidgetsaddons \
            ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "6dbdea28bc66853bfebf11e8b0c882f4"
SRC_URI[sha256sum] = "8eb20763b73ea73c4cad48f5b2d42ad813bb4aa40442ba8d832740efff676d8e"

FILES_${PN} += "${datadir}/dbus-1"
