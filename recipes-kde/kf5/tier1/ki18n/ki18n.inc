SUMMARY = "Advanced internationalization framework"
LICENSE = "BSD & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING-CMAKE-SCRIPTS;md5=3775480a712fc46a69647678acb234cb \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "c35c89cd31f7fef949e92def931ed3bc"
SRC_URI[sha256sum] = "b1d9c14fa5067235be02d2bb822cde5292edb0d54513f4e49dd28a641547bd53"
