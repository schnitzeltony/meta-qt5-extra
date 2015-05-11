SUMMARY = "Advanced embeddable text editor"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 perlnative

DEPENDS += "karchive kconfig kguiaddons ki18n kio kparts sonnet"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "430fcb2ea495a0fd847bbd29035f2b5e"
SRC_URI[sha256sum] = "10cecd7655d045b32d560cc0469d86978f8903f046a2ca3a14693c3a7710baab"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
