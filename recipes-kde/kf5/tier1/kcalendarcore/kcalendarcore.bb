SUMMARY = "Library for Interfacing with Calendars"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=c2d143c0ce3f53108f9725bcd58abf25 \
"

inherit kde-kf5

DEPENDS += "libical"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "269591a9e993c196c5fb33fe3879326e"
SRC_URI[sha256sum] = "50ffbe4feb9a602c09e130d6f10f0f260fa7625bc266003697895e1d716d6ba9"
