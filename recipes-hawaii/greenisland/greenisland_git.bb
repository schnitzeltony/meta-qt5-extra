SUMMARY = "Support library to make Qt-based Wayland compositors development easier"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE.LGPL;md5=4fbd65380cdd255951079008b364516c"

inherit kde pkgconfig

DEPENDS = "qtbase qtdeclarative qtwayland libkscreen qtquickcontrols"

SRC_URI = " \
	git://github.com/mauios/${BPN}.git;protocol=git;branch=master \
	file://0001-Add-versions-to-resources.patch \
	file://0002-Use-correct-API-for-QWaylandOutput.patch \
"
SRCREV = "c75e4cb64912ca0f3ffe26acc91466054a623dcc"
PV = "0.5.90+git${SRCPV}"

S = "${WORKDIR}/git"

EXTRA_OECMAKE += " \
	-DCMAKE_PROGRAM_PATH=${STAGING_DIR_NATIVE}/$bindir/qt5 \
"

# this should be fixed elsewhere..
CXXFLAGS_append_mx6 = " -DEGL_API_FB"

FILES_${PN} += "${libdir}/qml/GreenIsland"
FILES_${PN}-dbg += "${libdir}/qml/GreenIsland/.debug"
FILES_${PN}-dev += "${libdir}/cmake"
