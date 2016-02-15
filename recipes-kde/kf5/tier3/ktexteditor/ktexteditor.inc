SUMMARY = "Advanced embeddable text editor"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 perlnative

DEPENDS += "karchive kconfig kguiaddons ki18n kio kparts sonnet"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "165cc67fc95363ffa6e247b230965b09"
SRC_URI[sha256sum] = "b79515d2851b257c961cdf2c2aa5caa78ff9353468a01890966a90493821746c"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
