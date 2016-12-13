SUMMARY = "Porting aid from KDELibs4"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5-porting-aids perlnative

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "54bb78d0f05e78f3e185622b3b14f56d"
SRC_URI[sha256sum] = "e1c3640bbcbd622ce65f88017976beeaddca2f17bf9a0314ec2d8fe91fa731f2"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

SRC_URI += " \
	file://0001-make-broken-glib-a-configure-option-we-cannot-run-co.patch \
	file://0002-fix-build-for-QT_NO_SESSIONMANAGER.patch \
"
