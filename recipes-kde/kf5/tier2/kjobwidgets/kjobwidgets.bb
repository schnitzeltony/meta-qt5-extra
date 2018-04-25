SUMMARY = "Widgets for tracking KJob instances"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcoreaddons kcoreaddons-native kwidgetsaddons \
            ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "518b26bfffb06c97b5bd3209a2a39bbc"
SRC_URI[sha256sum] = "f2a1441262fffa82c17a3359687f523df021c2b7e0701bce1128de6614e686a4"

FILES_${PN} += "${datadir}/dbus-1"
