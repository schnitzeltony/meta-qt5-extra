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
SRC_URI[md5sum] = "75f1d6375f43c312132f4a56e215ef4e"
SRC_URI[sha256sum] = "ac6209391ca01ed8e0f1a58225f0abb2e0d721cfd25aa276a232c15008d14555"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5NotifyConfig, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5NotifyConfig, -S${includedir}, -S${STAGING_INCDIR}"
