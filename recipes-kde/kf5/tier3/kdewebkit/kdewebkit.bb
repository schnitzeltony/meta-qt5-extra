SUMMARY = "KDE Integration for QtWebKit"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += " \
    qtwebkit \
    kconfig \
    kcoreaddons \
    kio \
    kjobwidgets \
    kparts \
    kservice \
    kwallet \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "7e2bd16d3b35d75e1a21226af2257048"
SRC_URI[sha256sum] = "b9a00448f7a6129bd713e02633c0baeb8e1cd84ece599f9ebf0a24c356d558c0"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5WebKit, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5WebKit, -S${includedir}, -S${STAGING_INCDIR}"
