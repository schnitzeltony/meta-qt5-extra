SUMMARY = "Library for Interfacing with Calendars"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=c2d143c0ce3f53108f9725bcd58abf25 \
"

inherit kde-kf5

DEPENDS += "libical"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "8a2580532b1888604deeb085c7e357f7"
SRC_URI[sha256sum] = "af76009fdf12e8bda7fc72ece3ea1c183f5ed074930538f786c4fce2a2c20a95"
