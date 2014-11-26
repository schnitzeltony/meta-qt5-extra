SUMMARY = "Framework for providing different actions given a string query"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde 
#cmake-lib

SRCREV = "174472e8aae63899dbf09c9c07ba249d84d4a4c0"

DEPENDS += "qtdeclarative kconfig kcoreaddons ki18n kio"

#CMAKE_HIDE_ERROR[1] = "KF5Solid, -S${libdir}, -S${STAGING_LIBDIR}"

#FILES_${PN} += "${libdir}/qml"
#FILES_${PN}-dbg += "${libdir}/qml/org/kde/${BPN}/.debug"
