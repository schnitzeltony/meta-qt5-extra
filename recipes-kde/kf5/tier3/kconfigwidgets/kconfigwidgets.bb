SUMMARY = "Widgets for configuration dialog"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kauth kconfig kcodecs kdoctools kguiaddons kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "03bc05f0c72386a143d1b002178f95f6"
SRC_URI[sha256sum] = "f394366fb3d3e65b2c4ea49428113c5081f8a05d2e6cc945cb2b910b55d691fe"

RDEPENDS_${PN} += "perl"
