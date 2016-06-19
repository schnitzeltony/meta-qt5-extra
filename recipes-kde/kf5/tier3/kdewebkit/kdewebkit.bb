SUMMARY = "KDE Integration for QtWebKit"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

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
SRC_URI[md5sum] = "9799a785217ea8877f288348cce72c0f"
SRC_URI[sha256sum] = "73a4be6535b6d6389f747a3ef5544d122c49d29796688787576202786fc282d6"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5WebKit, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5WebKit, -S${includedir}, -S${STAGING_INCDIR}"
