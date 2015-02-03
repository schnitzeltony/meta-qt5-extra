SUMMARY = "Advanced text editing widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "kcompletion kconfig kconfigwidgets ki18n kiconthemes kservice kwidgetsaddons kwindowsystem sonnet"

PV = "${KF5_VERSION}"
SRCREV = "c9dfa8d8a289df07f40e83fb54976b6e06364020"
S = "${WORKDIR}/git"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5TextWidgets, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5TextWidgets, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${datadir}/kservicetypes5"
