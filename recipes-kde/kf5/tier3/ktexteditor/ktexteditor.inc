SUMMARY = "Advanced embeddable text editor"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 perlnative

DEPENDS += "karchive kconfig kguiaddons ki18n kio kparts sonnet"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "002fa8c6862fc2e59d14fad1a2feb6cb"
SRC_URI[sha256sum] = "ea3f4cca398fae7b419c23c16572857fbaa9f602ff7658c087c1faa59bdc711d"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
