SUMMARY = "Widgets for configuration dialog"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kauth kconfig kcodecs kdoctools kguiaddons kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "4deb8a01f99cb16bbcf80f1e11d90824"
SRC_URI[sha256sum] = "5a2a4e2ba62407a23f8fe0f6217faf8c32a9c5faa75c1f3be2bf8ec570d1c3a7"

RDEPENDS_${PN} += "perl"
