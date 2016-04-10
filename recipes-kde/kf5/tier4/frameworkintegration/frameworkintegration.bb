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
SRC_URI[md5sum] = "5c49bcff088db6b9d37977a53b1e561b"
SRC_URI[sha256sum] = "88d29e0270fe754228e93781aaf2399b1aa4a9da548f33edefa87dc950b07755"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5FrameworkIntegration, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5FrameworkIntegration, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += " \
    ${datadir}/knotifications5 \
    ${datadir}/kconf_update \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/*/.debug \
"
