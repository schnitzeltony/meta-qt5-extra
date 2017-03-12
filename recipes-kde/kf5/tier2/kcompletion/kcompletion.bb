SUMMARY = "Text completion helpers and widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfig kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "20db3b22928b899f58c6de789d13ac50"
SRC_URI[sha256sum] = "d1325841a08769807a3586870f7126585e46bd5d4e65a0d0c829883a728dc83a"
