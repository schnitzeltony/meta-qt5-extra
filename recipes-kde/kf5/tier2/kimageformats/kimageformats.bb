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
SRC_URI[md5sum] = "b54d8596c6be3b892688be3bb39efe15"
SRC_URI[sha256sum] = "cfd0a93ebd846fe246788ad91973c233e3e16f5cf9b9e0e094c76490f021abb2"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${datadir}/kservices5 \
"
FILES_${PN}-dbg += "${OE_QMAKE_PATH_PLUGINS}/*/.debug"
