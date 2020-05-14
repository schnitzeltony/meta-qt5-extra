SUMMARY = "Support for bookmarks and the XBEL format"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfigwidgets kconfig kiconthemes kxmlgui kconfig-native kcoreaddons-native \
            kauth-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "179a9b158eeb5e39eaa17c6bce86e1ff"
SRC_URI[sha256sum] = "5ae557a511ef90f1930d2cb0e898f62341264c61533cb6a8ab9027e6b767bbc4"
