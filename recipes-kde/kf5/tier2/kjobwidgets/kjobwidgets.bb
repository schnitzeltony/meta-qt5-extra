SUMMARY = "Widgets for tracking KJob instances"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcoreaddons kcoreaddons-native kwidgetsaddons \
            ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "a5cc3b4abb1b7986f99d3977c00afd16"
SRC_URI[sha256sum] = "3b39fc5dfc0f1a9cc9bffed3d05b90ba46c52c63cbbeffa0666f5f09e7093ce0"

FILES_${PN} += "${datadir}/dbus-1"
