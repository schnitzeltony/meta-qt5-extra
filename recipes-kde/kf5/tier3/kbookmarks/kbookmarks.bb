SUMMARY = "Support for bookmarks and the XBEL format"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfigwidgets kconfig kiconthemes kxmlgui kconfig-native kcoreaddons-native \
            kauth-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "070801192eb002c49c9af78cd4c1d044"
SRC_URI[sha256sum] = "9bd8c3226cde3fa307cc72875fe3f2b768949c16ef3b198e01a49a39b1624ea4"
