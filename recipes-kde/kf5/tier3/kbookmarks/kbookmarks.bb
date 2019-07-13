SUMMARY = "Support for bookmarks and the XBEL format"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfigwidgets kconfig kiconthemes kxmlgui kconfig-native kcoreaddons-native \
            kauth-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "b8cda472f958016a6701e39bffceba93"
SRC_URI[sha256sum] = "a2b77f0b084211badce2eb90c19e00caf078ab59512c326ed1c90f4a58de0d9f"
