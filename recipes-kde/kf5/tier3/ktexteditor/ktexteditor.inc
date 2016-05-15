SUMMARY = "Advanced embeddable text editor"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 perlnative

DEPENDS += "karchive kconfig kguiaddons ki18n kio kparts sonnet"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "da8543349ce3b6654fa68f696866888e"
SRC_URI[sha256sum] = "600759a60535d1dc278f445e599806f43ce4d01cd1101db35e8508801d434acb"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
