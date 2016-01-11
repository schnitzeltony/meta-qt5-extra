SUMMARY = "Advanced embeddable text editor"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 perlnative

DEPENDS += "karchive kconfig kguiaddons ki18n kio kparts sonnet"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "6c42319bacb47bc416fde04f57485a72"
SRC_URI[sha256sum] = "7b3cce5b1313561edd76113a92f651c9399b5d7d6a606cc61ecaf3e08b16a83b"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
