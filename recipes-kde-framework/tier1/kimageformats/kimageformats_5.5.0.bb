SUMMARY = "Image format plugins for Qt"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde

DEPENDS += "${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

SRCREV = "c21fc5982b50c544e03a9266d1fe763eb71ea2d9"

FILES_${PN} += "${libdir}/plugins ${datadir}/kservices5"
FILES_${PN}-dbg += "${libdir}/plugins/*/.debug"
