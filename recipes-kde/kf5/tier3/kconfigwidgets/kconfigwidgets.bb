SUMMARY = "Widgets for configuration dialog"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kauth kconfig kcodecs kdoctools kguiaddons kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "f359616c797860114c868c9aa2d3da01"
SRC_URI[sha256sum] = "0e8f08a105da9288d752910329a3183ad21cd6073dbea5b087f6e67e3239a969"

RDEPENDS_${PN} += "perl"
