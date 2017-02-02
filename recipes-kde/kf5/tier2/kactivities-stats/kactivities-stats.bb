SUMMARY = "A library for accessing the usage data collected by the activities system"
LICENSE = "LGPLv2+"
LIC_FILES_CHKSUM = " \
	file://COPYING.LGPL-2;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
	file://COPYING.LGPL-2.1;md5=4fbd65380cdd255951079008b364516c \
	file://COPYING.LGPL-3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

inherit kde-kf5

DEPENDS += " \
    boost \
    kconfig \
    kactivities \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "f8db28b3271f4f0213a0a9062bf4cae0"
SRC_URI[sha256sum] = "d950166fde6d7efb2cae3f97a9eab6577158739ffc520a41ea2d62da9465d584"
