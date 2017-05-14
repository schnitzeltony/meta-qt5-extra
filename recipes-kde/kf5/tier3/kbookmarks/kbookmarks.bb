SUMMARY = "Support for bookmarks and the XBEL format"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfigwidgets kconfig kiconthemes kxmlgui"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "1f745c77a2a7285962801a1260f22720"
SRC_URI[sha256sum] = "1bd846dde134d09fccb963d8d3749de6d6b05c9ad11b4c0cbc0241867e26f63d"
