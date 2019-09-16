SUMMARY = "Addons to QtWidgets"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qttools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "00faa81d83bf35162f1f44b4e37261f7"
SRC_URI[sha256sum] = "3a8e75d544783a1f567016f2669c3cfdbf2809b0a3d25afd03d38af62a493671"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
