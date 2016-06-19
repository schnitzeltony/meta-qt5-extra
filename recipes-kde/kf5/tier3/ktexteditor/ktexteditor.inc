SUMMARY = "Advanced embeddable text editor"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 perlnative

DEPENDS += "karchive kconfig kguiaddons ki18n kio kparts sonnet"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "b7dd9344c55b392ea0d7fc79935e14af"
SRC_URI[sha256sum] = "08eca5054f7b696671407cb628a657b9736b363c6a1476e4dd37adb3e46a2f76"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
