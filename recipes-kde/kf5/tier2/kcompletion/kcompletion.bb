SUMMARY = "Text completion helpers and widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfig kconfig-native kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "b5538be9104114cdf0d9ddfcf8034bbe"
SRC_URI[sha256sum] = "be5e272e257b9fe5b951d7c596fef7c75b16886e6b1cd5ebff60d87bd6dd495d"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
