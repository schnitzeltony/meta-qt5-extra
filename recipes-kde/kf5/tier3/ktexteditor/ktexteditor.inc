SUMMARY = "Advanced embeddable text editor"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 perlnative

DEPENDS += "karchive kconfig kguiaddons ki18n kio kparts sonnet"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "50aeddc84e24b3f69560c32aa56b9588"
SRC_URI[sha256sum] = "f992c5c7cf0d4f6427cb2194b18d27301c5e28b19bdaadd0ab370580bf71509b"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
