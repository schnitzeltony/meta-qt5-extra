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
SRC_URI[md5sum] = "e9f0975f2f57ef88e127cb1f38820484"
SRC_URI[sha256sum] = "f7f021286c4a34e06576cc69392b0b357b1a3321fc0bfc545dc023ecbaec85e2"
