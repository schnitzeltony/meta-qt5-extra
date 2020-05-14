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
SRC_URI[md5sum] = "0c875564917a3769ecb8695cdd87dfa6"
SRC_URI[sha256sum] = "2c3e04031320eea6ea8d5ef6a9a63fd223cb3efe456c142f986e7374cb83e2ef"
