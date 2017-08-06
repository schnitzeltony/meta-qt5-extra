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
SRC_URI[md5sum] = "acf1dfd56ed838a324ec8bd17524cbae"
SRC_URI[sha256sum] = "8433cfb3ccb67b1364ad5594a278ec5a920b8e10fb43b7b615acaa7fdb5f4e04"
