SUMMARY = "Widgets for configuration dialog"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kauth kconfig kcodecs kdoctools kguiaddons kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "158f513619ce94c5aa63b4f7576fd147"
SRC_URI[sha256sum] = "ca9580a1079adcc9f95907ea9355ee9b2ceaf001e7620005d2d0b1f1dd245e75"

RDEPENDS_${PN} += "perl"
