SUMMARY = "Widgets for configuration dialog"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "kauth kcodecs kdoctools kguiaddons kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "c8c0acdb6a0fea7cbb3058613b659751"
SRC_URI[sha256sum] = "097be090e442ff2b559267ee60e24002858a8b26f427984816d0f8da22797b22"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5ConfigWidgets, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5ConfigWidgets, -S${includedir}, -S${STAGING_INCDIR}"

RDEPENDS_${PN} += "perl"
