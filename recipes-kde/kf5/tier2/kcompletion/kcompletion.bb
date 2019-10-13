SUMMARY = "Text completion helpers and widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfig kconfig-native kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "9ca1b0f392623d050249ef11b136e6e9"
SRC_URI[sha256sum] = "4bc7458e44fe5fba0e18aa296236de4523acb47b51f73d5f0a8ca904def5ef81"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
