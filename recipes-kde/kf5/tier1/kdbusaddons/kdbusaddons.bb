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
SRC_URI[md5sum] = "b2e209ddccbb747c6dc56e31efe763d5"
SRC_URI[sha256sum] = "6b8e86ef5e5060ce4475a6e3a24f5860ff1b18be8340ba9348828fc86093a4c4"
