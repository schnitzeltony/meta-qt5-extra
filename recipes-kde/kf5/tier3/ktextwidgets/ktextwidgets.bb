SUMMARY = "Advanced text editing widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "kcompletion kconfig kconfigwidgets ki18n kiconthemes kservice kwidgetsaddons kwindowsystem sonnet"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "c4f03d70c30725e636eaf43b5dcfd893"
SRC_URI[sha256sum] = "d74eb97b7184eed70481a029bc3fe2129d56c7c3d48a3c1708377493cd59cdf7"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5TextWidgets, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5TextWidgets, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${datadir}/kservicetypes5"
