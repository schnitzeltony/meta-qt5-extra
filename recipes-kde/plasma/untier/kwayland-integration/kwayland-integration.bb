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
SRC_URI[md5sum] = "9367b62af472074a256b37b1de08cabe"
SRC_URI[sha256sum] = "c854133dcb0563a7150da1a4c32e6013e72c992d0a27e59af7a692c3cf658c71"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"
