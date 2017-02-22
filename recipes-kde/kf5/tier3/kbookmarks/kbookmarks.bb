SUMMARY = "Support for bookmarks and the XBEL format"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfigwidgets kconfig kiconthemes kxmlgui"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "8c1d5970b25f877567494486638d6082"
SRC_URI[sha256sum] = "77cff0b006b58ccb1c6187cb0de107bf82aed4e01798215d9e2f2491dfe8b975"
