SUMMARY = "Support library to make Qt-based Wayland compositors development easier"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE.LGPL;md5=4fbd65380cdd255951079008b364516c"

inherit cmake_qt5 cmake-lib pythonnative pkgconfig

DEPENDS = " \
    ${@base_contains('DISTRO_FEATURES', 'systemd', 'systemd', '', d)} \
    extra-cmake-modules-native \
    qtbase \
    qtdeclarative \
    qtquickcontrols \
    qtwayland \
    libkscreen \
    virtual/egl \
"
SRC_URI = "git://github.com/greenisland/${BPN}.git;protocol=git;branch=master"

SRCREV = "3f8ccb4613112eb3b0d7f9c3a3cf5c157fecbc92"
PV = "0.5.90+git${SRCPV}"

S = "${WORKDIR}/git"

# make it find qtwaylandscanner
EXTRA_OECMAKE += " \
	-DCMAKE_PROGRAM_PATH=${STAGING_DIR_NATIVE}/$bindir/qt5 \
"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "GreenIsland, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "GreenIsland, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${libdir}/qml/GreenIsland"
FILES_${PN}-dbg += "${libdir}/qml/GreenIsland/.debug"
FILES_${PN}-dev += "${libdir}/cmake"
