SUMMARY = "Widgets for configuration dialog"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kauth kconfig kcodecs kdoctools kguiaddons kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "ae734430daf80eb0b3fefcc83668e2f2"
SRC_URI[sha256sum] = "0de1ea128352ba817799aa7c272378dc0b71baf1801e530587c89680951cc533"

RDEPENDS_${PN} += "perl"
