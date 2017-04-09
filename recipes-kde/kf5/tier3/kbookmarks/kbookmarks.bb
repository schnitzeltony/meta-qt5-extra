SUMMARY = "Support for bookmarks and the XBEL format"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfigwidgets kconfig kiconthemes kxmlgui"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "3d6be7c72024f239a89ae0ac298fdc97"
SRC_URI[sha256sum] = "02358a9d11271cb6dec820a2dfaeb0d58d06cafa937a40425c14dffc978bcda0"
