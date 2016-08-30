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
SRC_URI[md5sum] = "cd6d6dbfc47cb82a7fb0b81adc24aad7"
SRC_URI[sha256sum] = "3db7b90f37ac78c813e2554ce48591b3535732207b1c94deed3a13aea554132e"
