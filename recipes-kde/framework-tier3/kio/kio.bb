SUMMARY = "Resource and network access abstraction"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

require ../../kf5-version.inc

inherit kde cmake-lib

DEPENDS += " \
	karchive \
	kcodecs \
	kconfig \
	kcoreaddons \
	kdbusaddons \
	kdoctools \
	ki18n \
	knotifications \
	kservice \
	solid \
	kxmlgui \
	kwallet \
	${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver", "", d)} \
"

SRCREV = "ec023712125ffc0a8cbb617c93285bdaa21f6381"

PACKAGECONFIG[full] = "-DKIOCORE_ONLY=OFF,-DKIOCORE_ONLY=ON, kbookmarks kcompletion kconfigwidgets kiconthemes kitemviews kjobwidgets kwidgetsaddons kwindowsystem"
PACKAGECONFIG ??= ""

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5KIO, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5KIO, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${datadir}/dbus-1 ${datadir}/k*5 ${libdir}/plugins"
FILES_${PN}-dbg += "${libdir}/plugins/.debug ${libdir}/${BPN}/kf5/.debug ${libdir}/plugins/kf5/*/.debug"
