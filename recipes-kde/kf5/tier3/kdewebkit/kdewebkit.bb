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
SRC_URI[md5sum] = "6fbaf96bfe290b7a411aae75febe7513"
SRC_URI[sha256sum] = "a915f77e074f98791dc90ce96fc9fd0def706462b3bde7fa0b82a84bf7b47156"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5WebKit, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5WebKit, -S${includedir}, -S${STAGING_INCDIR}"
