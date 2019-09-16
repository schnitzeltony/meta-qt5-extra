SUMMARY = "Models for Qt Model/View system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "4354127cea93f966787f37ca74d2af98"
SRC_URI[sha256sum] = "4ed6c4081cf6493d6f40ab45deb61325346ab8577eadec7ba8af6a36d7a6485e"
