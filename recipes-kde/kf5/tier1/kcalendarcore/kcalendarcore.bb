SUMMARY = "Library for Interfacing with Calendars"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=c2d143c0ce3f53108f9725bcd58abf25 \
"

inherit kde-kf5

DEPENDS += "libical"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "7848116a918431039a25f5a9b1353e9f"
SRC_URI[sha256sum] = "d5138db971f6be606be8ae7d761bad778af3cacada8e85fb2f469190c347cd94"
