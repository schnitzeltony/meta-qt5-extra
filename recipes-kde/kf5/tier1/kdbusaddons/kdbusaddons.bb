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
SRC_URI[md5sum] = "0283c5e0aed6c9c67145e131d2f9f8ec"
SRC_URI[sha256sum] = "d757340e5727b6437dad5cdb5cbe51fe6d96c814c44279b774fe56e2b66e7db9"
