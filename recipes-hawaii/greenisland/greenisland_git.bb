SUMMARY = "Support library to make Qt-based Wayland compositors development easier"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE.LGPL;md5=4fbd65380cdd255951079008b364516c"

inherit hawaii cmake-lib pythonnative pkgconfig

DEPENDS += " \
    ${@base_contains('DISTRO_FEATURES', 'systemd', 'systemd', '', d)} \
    wayland \
    qtwayland \
    libkscreen \
    virtual/egl \
"
SRC_URI = " \
    git://github.com/greenisland/${BPN}.git;protocol=git;branch=master \
"

SRCREV = "20806d3a107c2ee4c4ad1a62082ebdb86746637d"
PV = "0.5.93+git${SRCPV}"

S = "${WORKDIR}/git"

# make it find qtwaylandscanner
EXTRA_OECMAKE += " \
	-DCMAKE_PROGRAM_PATH=${STAGING_DIR_NATIVE}/$bindir/qt5 \
"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "GreenIsland, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "GreenIsland, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_QML}/GreenIsland \
    ${libdir}/plugins/greenisland \
"
FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_QML}/GreenIsland/.debug \
    ${libdir}/plugins/greenisland/.debug \
"
FILES_${PN}-dev += "${libdir}/cmake"
