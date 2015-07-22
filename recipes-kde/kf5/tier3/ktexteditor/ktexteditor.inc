SUMMARY = "Advanced embeddable text editor"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 perlnative

DEPENDS += "karchive kconfig kguiaddons ki18n kio kparts sonnet"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "7d1d89fd57da9a1ca5c331b878bac196"
SRC_URI[sha256sum] = "34dff31f2adcbd856a54b280a1194c0d05b75750baf07e57ae841c6a55f7cc25"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
