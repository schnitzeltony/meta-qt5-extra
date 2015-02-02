SUMMARY = "Addons to QtWidgets"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

DEPENDS += "qttools"

require ../../kf5-version.inc

inherit kde cmake-lib

SRCREV = "f5bbceadda6b80426a889e1554c2f4ee369840e3"

CMAKE_HIDE_ERROR[1] = "KF5WidgetsAddons, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5WidgetsAddons, -S${includedir}, -S${STAGING_INCDIR}"

