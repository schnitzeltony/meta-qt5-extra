SUMMARY = "Advanced embeddable text editor"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 perlnative

DEPENDS += "karchive kconfig kguiaddons ki18n kio kparts sonnet libgit2"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "c34217c409480ac45f48693c72e3ed8a"
SRC_URI[sha256sum] = "4a225b73c33dc0cc49fdf67eab60f119eca74b2e8a7801af16ecc5b87bf53e1b"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
