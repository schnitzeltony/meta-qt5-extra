SUMMARY = "Advanced embeddable text editor"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 perlnative

DEPENDS += "karchive kconfig kguiaddons ki18n kio kparts sonnet"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "086d75bdbefb15b2f7e9092eda23d70a"
SRC_URI[sha256sum] = "1cbb7e838a4aebc08e53add09988ed58475e2f512d1689081b084b6290ae3e3c"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
