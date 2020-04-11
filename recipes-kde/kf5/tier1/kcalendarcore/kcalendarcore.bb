SUMMARY = "Library for Interfacing with Calendars"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=c2d143c0ce3f53108f9725bcd58abf25 \
"

inherit kde-kf5

DEPENDS += "libical"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "34c5de64f18e342208987ec905542742"
SRC_URI[sha256sum] = "4ef44809c4766843f71b908eafa66d2b00047984c47abe8c62c80f06a2cc2184"
