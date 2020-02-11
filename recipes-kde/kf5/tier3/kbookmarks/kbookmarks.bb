SUMMARY = "Support for bookmarks and the XBEL format"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfigwidgets kconfig kiconthemes kxmlgui kconfig-native kcoreaddons-native \
            kauth-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "1236b6fd559c9ac85e5c7d82fe5bbb02"
SRC_URI[sha256sum] = "5c6853f7d3d10fb3997393e8347bf790d98cb1c2ceb1a6a292fa27302a3a005e"
