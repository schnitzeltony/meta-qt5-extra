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
SRC_URI[md5sum] = "6d72f273ccbcc08e65d6e42c97c36d51"
SRC_URI[sha256sum] = "c3c8ff00653e587448013f00f0797d6d78d64e00f0d92b9647cc81d07b54a20b"
