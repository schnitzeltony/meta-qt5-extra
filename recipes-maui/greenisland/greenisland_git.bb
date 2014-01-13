DESCRIPTION = "Support library to make Qt-based Wayland compositors development easier"
LICENSE = "LGPLv2+"
LIC_FILES_CHKSUM = "file://LICENSE.LGPL;md5=4fbd65380cdd255951079008b364516c"

inherit cmake_qt5

DEPENDS = "qtbase qtdeclarative qtwayland"

SRC_URI = " \
	git://github.com/mauios/${BPN}.git;protocol=git;branch=stable \
	file://0001-Make-packages-EGL-and-GLES2-optional.patch \
	file://0002-greenislandcompositor-fix-build.patch \
"
SRCREV = "3c26239ce213c1a029ba3cf3b6e8006dc3593018"
PV = "0.2.0.1+git${SRCPV}"

S = "${WORKDIR}/git"

FILES_${PN} += "${libdir}/hawaii/qml/GreenIsland"
FILES_${PN}-dbg += "${libdir}/hawaii/qml/GreenIsland/.debug"
FILES_${PN}-dev += "${libdir}/cmake"
