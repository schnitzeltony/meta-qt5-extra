SUMMARY = "Advanced embeddable text editor"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 perlnative

DEPENDS += "karchive kconfig kguiaddons ki18n kio kparts sonnet"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "cfbfab5e980de650448171d54ae2777c"
SRC_URI[sha256sum] = "6855afac82e69214c7494e3f37dd5b4988d3297bbd126abcd69c82a8b49e3398"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
