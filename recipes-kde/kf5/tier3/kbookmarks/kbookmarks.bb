SUMMARY = "Support for bookmarks and the XBEL format"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfigwidgets kconfig kiconthemes kxmlgui kconfig-native kcoreaddons-native \
            kauth-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "2c6edfead8cbea6eb513b69bd81f352f"
SRC_URI[sha256sum] = "6fd214d9d8b7a217c5e32f8093d8ebfb8fa7e21c37d14519f271b56f3f4a566f"
