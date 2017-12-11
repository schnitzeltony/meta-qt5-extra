SUMMARY = "Widgets for tracking KJob instances"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcoreaddons kcoreaddons-native kwidgetsaddons \
            ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "a933f40379454c722fcc6748d02b1fa5"
SRC_URI[sha256sum] = "1b97f3f89987d9dd58909ff1e1ef4fa81ffb144bb589cf80c5deae8ca8996db9"

FILES_${PN} += "${datadir}/dbus-1"
