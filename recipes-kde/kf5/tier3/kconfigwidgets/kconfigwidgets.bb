SUMMARY = "Widgets for configuration dialog"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kauth kconfig kcodecs kdoctools kguiaddons kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "5b3b10f284d8b0b7666316df32f45ab5"
SRC_URI[sha256sum] = "837f020c1b15f0d3bc9be5923983ed00f6d6b298186b8d127089ee6be65000b3"

RDEPENDS_${PN} += "perl"
