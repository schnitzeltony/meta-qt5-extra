SUMMARY = "Library for Interfacing with Calendars"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=c2d143c0ce3f53108f9725bcd58abf25 \
"

inherit kde-kf5

DEPENDS += "libical"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "87160c7e63e09d84576fa1a95758676a"
SRC_URI[sha256sum] = "825f8e4b3ec544e6ddb0d1b5638c765afd38f70f6e145bdf4cd6a717d8432ef8"
