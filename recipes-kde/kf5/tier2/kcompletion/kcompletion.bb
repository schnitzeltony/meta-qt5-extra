SUMMARY = "Text completion helpers and widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfig kconfig-native kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "43921b7d62ddfd40ce4326410e9da5f0"
SRC_URI[sha256sum] = "c84d95ef4bf3a1c3fbed04f8f2bf940a0904800ff96016224310c3124e051753"
