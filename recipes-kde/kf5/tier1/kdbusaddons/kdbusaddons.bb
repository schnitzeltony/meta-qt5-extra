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
SRC_URI[md5sum] = "c6c8f751eff1f03406f63bcfb1f4ffe0"
SRC_URI[sha256sum] = "d331b26eb2dc0a21cf6a9a810ccdd9401b07f4f479c9273198a189c6e2f769b7"
