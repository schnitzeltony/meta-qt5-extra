SUMMARY = "Widgets for configuration dialog"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kauth kconfig kcodecs kdoctools kguiaddons kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "2584c4380f904b914801c3d0597fe3fc"
SRC_URI[sha256sum] = "28a4243c245401bdc0b27616f94692b172b80a82b2408c158f5d57a95d8e7069"

RDEPENDS_${PN} += "perl"
