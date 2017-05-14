SUMMARY = "Text completion helpers and widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfig kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "34b9b0cc3d61210683a872976d27b9c9"
SRC_URI[sha256sum] = "9cddd50362b2f20273e4514b0c963182e65362964a82bec73270dab0ca6c1ba2"
