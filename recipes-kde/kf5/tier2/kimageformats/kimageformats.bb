SUMMARY = "Image format plugins for Qt"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += " \
    karchive \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)} \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "1148d408261f4e99689fa4d243004d9a"
SRC_URI[sha256sum] = "0d6d6a8664e4a01df27e9970ec9ec10a92c1d43a00a3e9ef0471d740b4c93d94"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${datadir}/kservices5 \
"
