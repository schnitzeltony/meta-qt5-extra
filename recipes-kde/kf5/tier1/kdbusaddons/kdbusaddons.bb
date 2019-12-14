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
SRC_URI[md5sum] = "cf9458331725aebdc89ac98b05a6fa1a"
SRC_URI[sha256sum] = "e2777538c6d1f0dd5956b3bc2c9cfe34fe360655c188e658f52f926ff8cb3fcc"
