SUMMARY = "Widget addons for Qt Model/View"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "bf537b167db6e601d43157cd429937e6"
SRC_URI[sha256sum] = "cea4935f8ee5c07cc72d4a024915850ecf2b463979eb8c50436c203949597c2b"
