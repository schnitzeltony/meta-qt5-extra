SUMMARY = "Widgets for tracking KJob instances"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcoreaddons kcoreaddons-native kwidgetsaddons \
            ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "1c65bee5dfc02d7671228dd90c59e19b"
SRC_URI[sha256sum] = "eefedadad329c1858604af076bc56748f2c7417c52d080c5aa8724b783393d53"

FILES_${PN} += "${datadir}/dbus-1"
