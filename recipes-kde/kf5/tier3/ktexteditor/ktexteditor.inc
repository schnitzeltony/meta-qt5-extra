SUMMARY = "Advanced embeddable text editor"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 perlnative

DEPENDS += "karchive kconfig kguiaddons ki18n kio kparts sonnet"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "fadc9c3d3a35fb65e05160a400d45b59"
SRC_URI[sha256sum] = "02ab78e7637bad1950a2c20c6b7adcb8c42c5802c7df3380d75dc759fa8d3fd5"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
