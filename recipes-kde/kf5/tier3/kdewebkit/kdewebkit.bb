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
SRC_URI[md5sum] = "1b6257e696414b8bdf2fe0f8ac9033cf"
SRC_URI[sha256sum] = "6e6a3c12cb88bebf207887a824fca61f9b8f9465d3501d178694da7df63703f7"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5WebKit, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5WebKit, -S${includedir}, -S${STAGING_INCDIR}"
