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
SRC_URI[md5sum] = "fbcc4a6e4daaf8dbbb623c8e58f48748"
SRC_URI[sha256sum] = "f4b0573cc45db3fb15913eb37b4931f95cffd7d6ebc0b98a817144f6986743ea"
