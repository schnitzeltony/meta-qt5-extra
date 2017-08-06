SUMMARY = "Support for bookmarks and the XBEL format"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfigwidgets kconfig kiconthemes kxmlgui kconfig-native kcoreaddons-native \
            kauth-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "8ee693c4ae47dce50e513cae00593d75"
SRC_URI[sha256sum] = "59339ef15f2740665fded42638d197ac9638f763191c30054d1870e4695ce684"
