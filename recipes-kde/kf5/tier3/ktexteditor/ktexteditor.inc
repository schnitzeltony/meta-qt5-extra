SUMMARY = "Advanced embeddable text editor"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 perlnative

DEPENDS += "karchive kconfig kguiaddons ki18n kio kparts sonnet"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "841582f66cde2bb2712f19fe3dc2d6a3"
SRC_URI[sha256sum] = "05979e604ac9cebdfa1d8c7871bdc48d732d2e2cad0cc1c3ea3bcc53f70c72fa"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
