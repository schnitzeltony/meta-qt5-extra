SUMMARY = "Support for bookmarks and the XBEL format"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfigwidgets kconfig kiconthemes kxmlgui"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "84faa17d2de691a534284e0c4afaccdb"
SRC_URI[sha256sum] = "71a9126427ac7ebfce98458c2f8d6fe954537e6b81b409e26f0d1ec7be8effc6"
