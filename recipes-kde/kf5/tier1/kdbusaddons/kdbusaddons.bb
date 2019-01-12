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
SRC_URI[md5sum] = "36071fd71585f98d952f554fefa1a7b7"
SRC_URI[sha256sum] = "6e7d5adb73fe7c8780b9264c37198f23d1edf2361fdb47c0257ef0c1f0d574bb"
