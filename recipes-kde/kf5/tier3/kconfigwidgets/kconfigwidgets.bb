SUMMARY = "Widgets for configuration dialog"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kauth kconfig kcodecs kdoctools kguiaddons kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "798e5545b7c9aba9de8191bb82053333"
SRC_URI[sha256sum] = "9111a98a6436e77d1dc37bf13f451c066f75c946b0e375042a283a0461365922"

RDEPENDS_${PN} += "perl"
