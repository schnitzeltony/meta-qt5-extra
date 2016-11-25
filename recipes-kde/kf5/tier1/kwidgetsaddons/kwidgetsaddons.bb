SUMMARY = "Addons to QtWidgets"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qttools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "c2e8cf3ca4029548c0e65142d8e8ec2f"
SRC_URI[sha256sum] = "d6f2e630038976b4eae4b1a510560a3af013c3c21ce88e07a88b5fbe58d042dc"
