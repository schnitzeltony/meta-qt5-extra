SUMMARY = "Text completion helpers and widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfig kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "dd89fd72867a8d84e710da62572bc872"
SRC_URI[sha256sum] = "6b1acf683de6d4b3ec36f7ddc270cd639268d25bb53217c83c9088a55f695ec0"
