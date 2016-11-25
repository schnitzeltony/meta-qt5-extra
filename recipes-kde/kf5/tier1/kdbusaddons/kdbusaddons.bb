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
SRC_URI[md5sum] = "a3fd10031c5b2a27da76c2c8c07be13e"
SRC_URI[sha256sum] = "888151ba5a4cb4fdcbc170c6b0f7b3086f7365356fa25b448bd173947b58bf1e"
