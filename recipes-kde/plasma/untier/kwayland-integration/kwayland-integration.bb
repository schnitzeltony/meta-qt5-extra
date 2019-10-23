SUMMARY = "Integration plugins for wayland windowing system"
DESCRIPTION = "Provides integration plugins for various KDE frameworks for the wayland windowing system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-plasma

DEPENDS += " \
    kidletime \
    kwindowsystem \
    kguiaddons \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "96a6ba2397121d32bdb465e3d0aa1d62"
SRC_URI[sha256sum] = "39aad4ef15bf960626a11be52b0056cbd945f53409275e668665ea6369f8ab90"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"
