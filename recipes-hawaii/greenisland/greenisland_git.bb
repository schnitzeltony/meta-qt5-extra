SUMMARY = "Support library to make Qt-based Wayland compositors development easier"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE.LGPL;md5=4fbd65380cdd255951079008b364516c"

inherit cmake_qt5 pythonnative pkgconfig

DEPENDS = "extra-cmake-modules-native qtbase qtdeclarative qtwayland ki18n libkscreen kservice virtual/egl"
SRC_URI = " \
	git://github.com/greenisland/${BPN}.git;protocol=git;branch=master \
"
#	file://0001-Use-correct-API-for-QWaylandOutput.patch

SRCREV = "e1dbde7b18d8a1f5256368d74baa6ce398334722"
PV = "0.5.90+git${SRCPV}"

S = "${WORKDIR}/git"

# for wayland scanner
EXTRA_OECMAKE += " \
	-DCMAKE_PROGRAM_PATH=${STAGING_DIR_NATIVE}/$bindir/qt5 \
"

# this should be fixed elsewhere..
CXXFLAGS_append_mx6 = " -DEGL_API_FB"

FILES_${PN} += "${libdir}/qml/GreenIsland"
FILES_${PN}-dbg += "${libdir}/qml/GreenIsland/.debug"
FILES_${PN}-dev += "${libdir}/cmake"
