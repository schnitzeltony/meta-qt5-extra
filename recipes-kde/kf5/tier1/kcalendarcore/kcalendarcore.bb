SUMMARY = "Library for Interfacing with Calendars"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=c2d143c0ce3f53108f9725bcd58abf25 \
"

inherit kde-kf5

DEPENDS += "libical"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "e11cfcd253a4e32ec1c092b8d601940b"
SRC_URI[sha256sum] = "bbdb48c775ccc1e1bdba962b5ccdc0611a2d14523076d33c4507c05db3ab33d3"
