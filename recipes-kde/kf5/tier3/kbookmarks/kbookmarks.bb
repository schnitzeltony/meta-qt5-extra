SUMMARY = "Support for bookmarks and the XBEL format"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfigwidgets kconfig kiconthemes kxmlgui"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "df26bd179862cc72a6219236cd6c9d3f"
SRC_URI[sha256sum] = "f21439ad5dc53090b5a895af50c811ac539c4fe7dd741477713e86b07b71105e"
