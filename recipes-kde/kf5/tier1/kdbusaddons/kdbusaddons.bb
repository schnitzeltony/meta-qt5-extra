SUMMARY = "Addons to QtDBus"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += " \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)} \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "d7de1a2c0cd9c3308aee5c932573a3da"
SRC_URI[sha256sum] = "74a6eb443a74eb74a859238b555a3b16be1d6367c4db2a7af5b16da528d57f62"
