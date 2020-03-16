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
SRC_URI[md5sum] = "22c53e5a2f19cb93d35abe0d2fd09533"
SRC_URI[sha256sum] = "839fe42f9ac8df353f87245110fd7b515a8eb29f0840f54481bd89e5175bf1af"
