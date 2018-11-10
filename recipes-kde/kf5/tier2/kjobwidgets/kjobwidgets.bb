SUMMARY = "Widgets for tracking KJob instances"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcoreaddons kcoreaddons-native kwidgetsaddons \
            ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "f3dcb4dc2826314f51a7c79110f400e2"
SRC_URI[sha256sum] = "021d3777a106aa2a0157b35fd734822370a3ab1370de1c5b3a4987d99e65f0b7"

FILES_${PN} += "${datadir}/dbus-1"
