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
SRC_URI[md5sum] = "f5072e554e57e9e245e7f56944611826"
SRC_URI[sha256sum] = "3c6b14bcf7f6f3a927d485afba9ed3051cbe513441ed17f5d484419388da825c"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"
