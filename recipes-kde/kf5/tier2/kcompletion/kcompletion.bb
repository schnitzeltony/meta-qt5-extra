SUMMARY = "Text completion helpers and widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfig kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "81234f797d4da26106a91bdcc34440df"
SRC_URI[sha256sum] = "6f5401edad5619b3ce46264294e5c9259bee0b4ebbf5581410104117bea6a14b"
