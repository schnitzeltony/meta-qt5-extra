SUMMARY = "Widgets for tracking KJob instances"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcoreaddons kwidgetsaddons ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "49a2be90d1e79e4c69863e882b2dea76"
SRC_URI[sha256sum] = "ca74a72b7c204cd4709b19e9ccab29008267035338ed2543af0b63d3e4120676"

FILES_${PN} += "${datadir}/dbus-1"
