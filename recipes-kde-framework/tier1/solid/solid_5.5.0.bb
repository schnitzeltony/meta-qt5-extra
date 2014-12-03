SUMMARY = "Hardware integration and detection"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde cmake-lib

SRCREV = "1424bccf5b6772c072612c72f2db8e0ce50cd1d3"

DEPENDS += "qtdeclarative"

CMAKE_HIDE_ERROR[1] = "KF5Solid, -S${libdir}, -S${STAGING_LIBDIR}"

FILES_${PN} += "${libdir}/qml"
FILES_${PN}-dbg += "${libdir}/qml/org/kde/${BPN}/.debug"
