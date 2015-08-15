SUMMARY = "Workspace and cross-framework integration plugins"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 cmake-lib

DEPENDS += " \
    kconfig \
    kconfigwidgets \
    ki18n \
    kiconthemes \
    kio \
    knotifications \
    kwidgetsaddons \
"

RRECCOMENDS_${PN} += "oxygen-fonts"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "49ad49bff5ece8defe71021982476662"
SRC_URI[sha256sum] = "4b2232d18e918c5af18fcd7f7ac14d6c39a3999b62d24d1cab2bc43d0c8bff0e"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5FrameworkIntegration, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5FrameworkIntegration, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += " \
    ${datadir}/knotifications5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/*/.debug \
"
