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
SRC_URI[md5sum] = "2fd487f58c349e7c5adcb4f96bd5948c"
SRC_URI[sha256sum] = "86946d97e74420637f59ea0fff93e303bcbdc5b1d5e1c6361e2d9a3ceb0e1259"
