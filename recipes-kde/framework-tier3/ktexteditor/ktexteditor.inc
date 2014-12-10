SUMMARY = "Advanced embeddable text editor"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde perlnative

DEPENDS += "karchive kconfig kguiaddons ki18n kio kparts sonnet"

SRCREV = "8b467c021a978215a28bd44e5dbfc023f0007dfc"
PV = "5.5.0"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
