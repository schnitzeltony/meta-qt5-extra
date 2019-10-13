SUMMARY = "Library for Interfacing with Calendars"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=c2d143c0ce3f53108f9725bcd58abf25 \
"

inherit kde-kf5

DEPENDS += "libical"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "71bce25921b8e2ae8628230621123732"
SRC_URI[sha256sum] = "43dfecd3dfd0f44ee3e0029613561822f3dd3b3145b52c4dd3e72b67dae518b3"
