SUMMARY = "Abstraction to system policy and authentication features"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "73863244f37c68ff2042fd7039da9480"
SRC_URI[sha256sum] = "b04458f32046b2dd61b48118646180df63d2c843cb2d53560aaa15168df087f1"

EXTRA_OECMAKE += "-DAUTOTESTS=OFF"
