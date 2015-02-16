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
SRC_URI[md5sum] = "3c8027a2eb04cc76bf8dba23cddb88fa"
SRC_URI[sha256sum] = "bf4f68adbeeea32f8d179dc8b1b266dd53fee7870101776fb73121d98c12eb13"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5WebKit, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5WebKit, -S${includedir}, -S${STAGING_INCDIR}"
