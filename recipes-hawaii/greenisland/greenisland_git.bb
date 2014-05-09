DESCRIPTION = "Support library to make Qt-based Wayland compositors development easier"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE.LGPL;md5=4fbd65380cdd255951079008b364516c"

inherit cmake_qt5 hawaii-target

DEPENDS = "qtbase qtdeclarative qtwayland"

SRC_URI = " \
	git://github.com/mauios/${BPN}.git;protocol=git;branch=dev \
	file://0001-greenislandcompositor-fix-build.patch \
"
SRCREV = "0fe1296b51ac6633c7c5072c8ed2f74556e4b96e"
PV = "0.2.90+git${SRCPV}"

S = "${WORKDIR}/git"

FILES_${PN} += "${libdir}/hawaii/qml/GreenIsland"
FILES_${PN}-dbg += "${libdir}/hawaii/qml/GreenIsland/.debug"
FILES_${PN}-dev += "${libdir}/cmake"
