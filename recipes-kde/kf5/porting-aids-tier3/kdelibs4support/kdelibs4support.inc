SUMMARY = "Porting aid from KDELibs4"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5-porting-aids perlnative

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "9147a60c020699b4d3b3c4c907f933be"
SRC_URI[sha256sum] = "a1901c892aa6b3233ad3123648ccce9f197e81479d980e9738231a5c87d1518b"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

SRC_URI += " \
	file://0001-make-broken-glib-a-configure-option-we-cannot-run-co.patch \
	file://0002-fix-build-for-QT_NO_SESSIONMANAGER.patch \
"
