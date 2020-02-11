SUMMARY = "Library for Interfacing with Calendars"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=c2d143c0ce3f53108f9725bcd58abf25 \
"

inherit kde-kf5

DEPENDS += "libical"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "91aadb3a165ac2ec1f5ab01f523bdeed"
SRC_URI[sha256sum] = "b24642e98a0c2459a543eb910e7e964c04724816e52568ab1decbf19ea54fff4"
