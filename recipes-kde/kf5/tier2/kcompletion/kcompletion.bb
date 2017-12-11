SUMMARY = "Text completion helpers and widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfig kconfig-native kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "4dfd9f0b601b3b29fda431e67749d84b"
SRC_URI[sha256sum] = "63fba36b9edd1691a26b7ea211e0f44cdf8616622168ba4df408174d6881cb2c"
