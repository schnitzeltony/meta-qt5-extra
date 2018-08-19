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
SRC_URI[md5sum] = "a496b86727152d8b59ed2a2228003ac2"
SRC_URI[sha256sum] = "70c5e439c2ecfa56ef0d65492ad77fd85fea7ea47fe2efa4e76e8eeb5cced5ba"
