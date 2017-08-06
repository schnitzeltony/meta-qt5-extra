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
SRC_URI[md5sum] = "72c6b728489dbfc68c822280d1b3c107"
SRC_URI[sha256sum] = "09dd24c46bfa1d5a7422849de2940fd6aa66bf63c4b915cf7f6d7c51533320c8"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${datadir}/kservices5 \
"
FILES_${PN}-dbg += "${OE_QMAKE_PATH_PLUGINS}/*/.debug"
