SUMMARY = "Support for bookmarks and the XBEL format"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfigwidgets kconfig kiconthemes kxmlgui kconfig-native kcoreaddons-native \
            kauth-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "f9da440968a94d4618b293837ab0b729"
SRC_URI[sha256sum] = "e623b0c353ae0217f31fad7e7887e37cd6ba81f75a4b0159dc1f7a2a4d1152f6"
