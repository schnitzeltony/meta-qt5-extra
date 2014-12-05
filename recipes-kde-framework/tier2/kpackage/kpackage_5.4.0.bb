SUMMARY = "Library to load and install packages of non binary files as they were a plugin"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde cmake-lib

DEPENDS += "karchive ki18n kcoreaddons kconfig kdoctools"

SRCREV = "784f6ad925d2121278521dcfcd17f8892ca6c042"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5Package, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5Package, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${datadir}/k*5"
