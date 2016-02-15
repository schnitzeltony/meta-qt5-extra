SUMMARY = "Configuration system for KNotify"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 cmake-lib

DEPENDS += " \
    phonon \
    kcompletion \
    kconfig \
    ki18n \
    kio \
    kservice \
    kconfigwidgets \
    knotifications \
    kwidgetsaddons \
    kxmlgui \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "6acd427037e73e23f3087db88ed11ecc"
SRC_URI[sha256sum] = "d2757b3b283b90575c7b0820260db7d9447f65b02c1aa78fb7b3fdeef3ce2b98"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5NotifyConfig, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5NotifyConfig, -S${includedir}, -S${STAGING_INCDIR}"
