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
SRC_URI[md5sum] = "bb5e0dd8aeffbe28c018225823a28190"
SRC_URI[sha256sum] = "d6f0356ded865f415532719feccbaa6112a0732a16b0e233494296a7f610cad1"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5NotifyConfig, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5NotifyConfig, -S${includedir}, -S${STAGING_INCDIR}"
