SUMMARY = "Widgets for tracking KJob instances"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcoreaddons kcoreaddons-native kwidgetsaddons \
            ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "540a8e1b5b9f08657b7684622660e17c"
SRC_URI[sha256sum] = "3be3370926c5c9bc09894dcdab54e93850f88507752fcc74494a628d70db46b0"

FILES_${PN} += "${datadir}/dbus-1"
