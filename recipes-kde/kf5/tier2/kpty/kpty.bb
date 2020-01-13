SUMMARY = "Pty abstraction"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gettext

DEPENDS += "kcoreaddons kcoreaddons-native ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "d6576b72c6d4b1bdf162f51e58419876"
SRC_URI[sha256sum] = "a7fac6ced7504cec13a6776f0f4ba22db9878e44e2bbf85a219a2590e061c859"
