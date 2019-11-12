SUMMARY = "Library for Interfacing with Calendars"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=c2d143c0ce3f53108f9725bcd58abf25 \
"

inherit kde-kf5

DEPENDS += "libical"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "317e43aaabd64bbe60910aee9aec5d45"
SRC_URI[sha256sum] = "983f240a7478a780dc403d577827f027856f9f67e8c3bfe8b69d56093e5bb80e"
