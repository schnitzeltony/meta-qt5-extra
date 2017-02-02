SUMMARY = "Widgets for configuration dialog"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kauth kconfig kcodecs kdoctools kguiaddons kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "7ea2abe3515ad479b743d2447a194483"
SRC_URI[sha256sum] = "021d85537faf01b9a88a9614edf9011a7e2dac752330f4928a287f4832263996"

RDEPENDS_${PN} += "perl"
