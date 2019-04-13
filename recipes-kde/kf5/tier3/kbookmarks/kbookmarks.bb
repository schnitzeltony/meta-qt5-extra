SUMMARY = "Support for bookmarks and the XBEL format"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfigwidgets kconfig kiconthemes kxmlgui kconfig-native kcoreaddons-native \
            kauth-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "afdb9602598bdebfa1a01c2ebd0c1565"
SRC_URI[sha256sum] = "bf57f111e176ab2ecb79646b1f93cf5d84a8d3fcfb13b805b5140e75b42eb085"
