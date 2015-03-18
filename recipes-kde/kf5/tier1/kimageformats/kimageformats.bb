SUMMARY = "Image format plugins for Qt"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "43020f2187f4e5015327a857e4a9f406"
SRC_URI[sha256sum] = "5fedb3fa757096ea7732bdc960221eed8f633e5c54badc02b4f8e282dd8dd616"

FILES_${PN} += "${libdir}/plugins ${datadir}/kservices5"
FILES_${PN}-dbg += "${libdir}/plugins/*/.debug"
