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
SRC_URI[md5sum] = "8545f8af6620093187421f7cccfcb38b"
SRC_URI[sha256sum] = "d32e0b16abcb2b1593a567b0ef12cfb94ec2f08e5b8a3ec56efac19b22ca0152"
