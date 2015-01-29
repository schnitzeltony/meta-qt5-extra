SUMMARY = "Support for emoticons and emoticons themes"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

require ../../kf5-version.inc

inherit kde cmake-lib

DEPENDS += "karchive kconfig kservice kcoreaddons"

SRCREV = "df487b4808daa448692b8d3277f745a952e71945"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5Emoticons, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5Emoticons, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${datadir}/emoticons ${datadir}/k*5"
FILES_${PN}-dbg += "${libdir}/plugins/kf5/*/.debug"
