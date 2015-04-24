SUMMARY = "Advanced embeddable text editor"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 perlnative

DEPENDS += "karchive kconfig kguiaddons ki18n kio kparts sonnet"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "42216cb36a2d02b45121751c75798db0"
SRC_URI[sha256sum] = "8bc4b7015a417d02393fd62964fb0f412f2d30c933132cb6de1d22bc201e9189"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
