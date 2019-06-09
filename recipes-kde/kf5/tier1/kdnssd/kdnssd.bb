SUMMARY = "Abstraction to system DNSSD features"
LICENSE = "MIT & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
	file://COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1 \
"

inherit kde-kf5

DEPENDS += "avahi"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "30b3b750873d94d4424ffa2838f501de"
SRC_URI[sha256sum] = "08b3a948b33c529ffbf5e9c64ae64fd73b50e20ebfa0e52f4346ad62a3c283d6"
