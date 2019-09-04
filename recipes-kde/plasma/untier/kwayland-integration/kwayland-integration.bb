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
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "bcd44ec98c9a8e6b99c703ea7eeef087"
SRC_URI[sha256sum] = "63724ecfb6db053ee949273979b393192309dbeed45b59bc193a605f90232282"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"
