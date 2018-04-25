SUMMARY = "Abstraction to system policy and authentication features"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "3a57ead0361db6e00c9b37bacb9892cc"
SRC_URI[sha256sum] = "d1149f2f3a653608519bdd31f2832b85c1806a8a981334afa5e07089e77ad7c8"

EXTRA_OECMAKE += "-DAUTOTESTS=OFF"
