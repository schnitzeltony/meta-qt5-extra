SUMMARY = "Widgets for tracking KJob instances"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcoreaddons kcoreaddons-native kwidgetsaddons \
            ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "0857a968c2d46935d875d5863134487b"
SRC_URI[sha256sum] = "63f3b2fc1c062b1a485ff543e2d5afa68a9f9a918676bf3a6a5dc8f56f5f30e3"

FILES_${PN} += "${datadir}/dbus-1"
