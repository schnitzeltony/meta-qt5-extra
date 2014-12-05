SUMMARY = "Resource and network access abstraction"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde cmake-lib

DEPENDS += " \
	karchive \
	kbookmarks \
	kcodecs \
	kcompletion \
	kconfig \
	kconfigwidgets \
	kcoreaddons \
	kdbusaddons \
	kdoctools \
	ki18n \
	kiconthemes \
	kitemviews \
	kjobwidgets \
	knotifications \
	kservice \
	solid \
	kwidgetsaddons \
	kwindowsystem \
	kxmlgui \
	kwallet \
"

SRCREV = "72b971ef5618b41452e709819b217be4ba5a200e"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5KIO, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5KIO, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${datadir}/dbus-1 ${datadir}/k*5 ${libdir}/plugins"
FILES_${PN}-dbg += "${libdir}/plugins/.debug ${libdir}/${BPN}/kf5/.debug ${libdir}/plugins/kf5/*/.debug"
