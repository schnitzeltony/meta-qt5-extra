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
SRC_URI[md5sum] = "2b820b9d247a2be52a2d0ac2aa911618"
SRC_URI[sha256sum] = "c3b02befbb03f25deca0c7ffafea8c8a5eb79e21d8e2e566bf6fddf4f8afe04d"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${datadir}/kservices5 \
"
