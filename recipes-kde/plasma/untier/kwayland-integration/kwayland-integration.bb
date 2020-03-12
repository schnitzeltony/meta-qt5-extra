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
SRC_URI[md5sum] = "b1b6099478c9d2518aad1f81859e2da2"
SRC_URI[sha256sum] = "2fbebc90100d30e09d68066922e1154b1012059268694d1ad3cc0a4f49759369"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"
