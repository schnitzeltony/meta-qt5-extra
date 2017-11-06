SUMMARY = "Text completion helpers and widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfig kconfig-native kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "983ff537be5cb9e4914359dbdbfeda15"
SRC_URI[sha256sum] = "ba1e6a72e827d2657d518111271cf12eeddb70ec68b0f8943d4bfa632f614d26"
