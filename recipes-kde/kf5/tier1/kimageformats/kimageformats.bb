SUMMARY = "Image format plugins for Qt"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "b47e7ca8ccc7ae008dac9534f50e65ff"
SRC_URI[sha256sum] = "5e09e81ca0a6f3edab335998a877822c8d701933bbe2ae6e3e68cdd83c0d1a90"

FILES_${PN} += " \
    ${libdir}/${QT_DIR_NAME}/plugins \
    ${datadir}/kservices5 \
"
FILES_${PN}-dbg += "${libdir}/${QT_DIR_NAME}/plugins/*/.debug"
