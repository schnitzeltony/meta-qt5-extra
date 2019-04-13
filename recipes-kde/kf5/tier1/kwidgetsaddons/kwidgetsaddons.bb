SUMMARY = "Addons to QtWidgets"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qttools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "b85e32d16c9d4c46a31a28ca63160c4d"
SRC_URI[sha256sum] = "abd80a566e1003bca7c72d3a0dc1ee470bc9935d11371cfff0d960f11e1ef5c2"
