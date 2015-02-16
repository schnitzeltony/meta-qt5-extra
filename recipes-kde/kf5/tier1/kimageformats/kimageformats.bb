SUMMARY = "Image format plugins for Qt"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "d45ee89eabdb1d12a5a76cad60943084"
SRC_URI[sha256sum] = "8a12050860aa5cc54014c7af9313a3ab2c7cb7c943c33f8e4f2cb70bbd50ef01"

FILES_${PN} += "${libdir}/plugins ${datadir}/kservices5"
FILES_${PN}-dbg += "${libdir}/plugins/*/.debug"
