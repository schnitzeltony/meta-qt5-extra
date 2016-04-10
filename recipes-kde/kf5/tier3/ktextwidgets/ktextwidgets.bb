SUMMARY = "Advanced text editing widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "kcompletion kconfig kconfigwidgets ki18n kiconthemes kservice kwidgetsaddons kwindowsystem sonnet"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "5c222b40f6af596aa3c9a421b25ac10c"
SRC_URI[sha256sum] = "f6fb3e1d6e37e38e436be3ac2048da81d3a215bad303a5f042c78895a489da86"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5TextWidgets, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5TextWidgets, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${datadir}/kservicetypes5"
