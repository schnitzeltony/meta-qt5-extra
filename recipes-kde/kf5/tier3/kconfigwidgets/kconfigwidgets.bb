SUMMARY = "Widgets for configuration dialog"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kauth kconfig kcodecs kdoctools kguiaddons kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "7647c86266b61075542b4112e5f21a72"
SRC_URI[sha256sum] = "13265a75a3617cb51da521957f1fa34d40f5960fea73f41e16373ba7ef559340"

RDEPENDS_${PN} += "perl"
