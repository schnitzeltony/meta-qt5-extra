SUMMARY = "Widget addons for Qt Model/View"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qttools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "1ea4d07760d1ae0561c8c9aa086d6546"
SRC_URI[sha256sum] = "a778eba6da9e56399b81dfb978745d919b0edc7580e67311ad137d94751fa8b1"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
