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
SRC_URI[md5sum] = "f4803df6d6af22bdbecd3a1847db6254"
SRC_URI[sha256sum] = "be71bd06dd42e8535d04fe6e85c16da574ca793af9eb07c4f4f68fd8ad93c121"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5WebKit, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5WebKit, -S${includedir}, -S${STAGING_INCDIR}"
