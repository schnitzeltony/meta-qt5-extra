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
SRC_URI[md5sum] = "86f5f66830405ed2a386401b246e71b2"
SRC_URI[sha256sum] = "82d6943d79a9a2a9bce10623adb2c9af396a2dcf258a723bb349aafbde20e6d5"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"
