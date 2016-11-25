SUMMARY = "Text completion helpers and widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfig kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "0e27db4101ee49f41334c25ad35fd22c"
SRC_URI[sha256sum] = "6e1ca1714294e5906700cbba72b11e6cf9692c7239ded5478b93f6638d8334fb"
