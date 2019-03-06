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
SRC_URI[md5sum] = "5785b3916a0aa9b4f6dac91288fb72a4"
SRC_URI[sha256sum] = "5b55f8e8acf18998d3fa2cbf27c2c6686a82fd81bfce9bab0f35d4372b3507c8"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"
