SUMMARY = "Advanced embeddable text editor"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 perlnative

DEPENDS += "karchive kconfig kguiaddons ki18n kio kparts sonnet"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "4e4cdc9d49dd3a3a865d91ffaec392ba"
SRC_URI[sha256sum] = "fd243ecd7b7527f9ceeb7362175e800b027d96b65109a1ffa63ac3e6ba272c84"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
