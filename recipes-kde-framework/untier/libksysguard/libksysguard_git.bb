SUMMARY = "KSE sysguard library"
LICENSE = "GPLv2 LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde cmake-lib

DEPENDS += " \
	qtwebkit \
	kcoreaddons \
	kconfig \
	ki18n \
	kwindowsystem \
	kcompletion \
	kauth \
	kwidgetsaddons \
	kiconthemes \
	kconfigwidgets \
	kservice \
	plasma-framework \
	kauth \
	${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver qtx11extras", "", d)} \
"

SRCREV = "e52a86fde551660853e94f33fcdefc7900eb1c45"
PV = "5.1.90+git${SRCPV}"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5SysGuard, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5SysGuard, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${datadir} ${libdir}/kauth"
FILES_${PN}-dbg += "${libdir}/kauth/.debug"
