SUMMARY = "Abstraction to system policy and authentication features"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "1e41eae5f42f03b2de331460f280a327"
SRC_URI[sha256sum] = "7788efd5710b939c302bb461681bcf47d55a39767ea15d5cdb760cf07c2fefa9"

SRC_URI += " \
	file://0001-Make-autotests-optional.patch \
	file://0002-align-installation-location-for-helpers.patch \
"

EXTRA_OECMAKE += "-DAUTOTESTS=OFF"
