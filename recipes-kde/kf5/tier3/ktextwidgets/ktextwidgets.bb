SUMMARY = "Advanced text editing widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "kcompletion kconfig kconfigwidgets ki18n kiconthemes kservice kwidgetsaddons kwindowsystem sonnet"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "0f462365b296549e05de2159f18dd3e2"
SRC_URI[sha256sum] = "898c25658315cb86cfae36cfcb879e02a2957fbd704f79551daf9fb08d9cfbd3"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5TextWidgets, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5TextWidgets, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${datadir}/kservicetypes5"
