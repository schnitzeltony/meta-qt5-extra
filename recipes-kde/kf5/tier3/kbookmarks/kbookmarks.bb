SUMMARY = "Support for bookmarks and the XBEL format"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfigwidgets kconfig kiconthemes kxmlgui kconfig-native kcoreaddons-native \
            kauth-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "79ee853160049beebcf36c419d738313"
SRC_URI[sha256sum] = "b225463ec0fe2424a1f5e70c83b02e3ece6a3ca80832cd2621732d18d7160a43"
