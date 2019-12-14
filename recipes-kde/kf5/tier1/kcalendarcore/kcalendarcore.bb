SUMMARY = "Library for Interfacing with Calendars"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=c2d143c0ce3f53108f9725bcd58abf25 \
"

inherit kde-kf5

DEPENDS += "libical"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "28b90fc25fc80ca46db71acef44b1fcb"
SRC_URI[sha256sum] = "fb79dc1bd1153c7fc38242c577a324462b8913e151bc33b74f7997e48d494cb8"
