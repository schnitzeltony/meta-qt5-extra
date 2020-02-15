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
SRC_URI[md5sum] = "76828427796d566b04947c01219fb538"
SRC_URI[sha256sum] = "77a0572a0e1176c4d1361741dccb53800a9812ec17d01f391ccee7a68d911002"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"
