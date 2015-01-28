SUMMARY = "Image format plugins for Qt"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde

DEPENDS += "${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

SRCREV = "6b72930cb2c8255cd14a8f0924af693b23be37c1"

FILES_${PN} += "${libdir}/plugins ${datadir}/kservices5"
FILES_${PN}-dbg += "${libdir}/plugins/*/.debug"
