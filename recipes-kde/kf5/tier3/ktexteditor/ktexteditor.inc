SUMMARY = "Advanced embeddable text editor"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 perlnative

DEPENDS += "karchive kconfig kguiaddons ki18n kio kparts sonnet"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "9a2f27c1ee892848bde4d21aaa694d7c"
SRC_URI[sha256sum] = "034f2401af66ff94e6ce1b8ecc99abce873ca146344a362ae5b8ef3f05572246"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
