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
SRC_URI[md5sum] = "e2dac1fb5774aff10dc043dabfb9de42"
SRC_URI[sha256sum] = "8e7827c9df8e7dab3055009a7af18e39eb9fc3cdadfbf3b677f9de86e0b00850"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"
