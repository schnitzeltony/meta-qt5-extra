SUMMARY = "Advanced embeddable text editor"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 perlnative

DEPENDS += "karchive kconfig kguiaddons ki18n kio kparts sonnet"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "8d7b4487743292ce2a21a84867f5d519"
SRC_URI[sha256sum] = "4e78c9efcc745266b8bb3140f85ce2376932f15387a6f998c470df71e2c551dd"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
