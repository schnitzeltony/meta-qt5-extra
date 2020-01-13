SUMMARY = "Abstraction to system policy and authentication features"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "87a904be2782b17b4dd219e800cb4729"
SRC_URI[sha256sum] = "f167ec8f926caf348a161a39e0c0588f517fe3a49ab4f39c1dfa94f47e104414"

EXTRA_OECMAKE += "-DAUTOTESTS=OFF"
