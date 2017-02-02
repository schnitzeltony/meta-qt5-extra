SUMMARY = "Support for bookmarks and the XBEL format"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfigwidgets kconfig kiconthemes kxmlgui"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "254c543199c4ff45f9896930c8c3ad5e"
SRC_URI[sha256sum] = "5fa0cf48bf3eaef337f6368736dd1a978682382680a3739d48365931007f2b32"
