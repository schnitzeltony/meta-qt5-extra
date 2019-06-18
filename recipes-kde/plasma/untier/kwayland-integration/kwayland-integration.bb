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
SRC_URI[md5sum] = "221a811ba73e4bbf871adfcac899e419"
SRC_URI[sha256sum] = "3f3e53ef60d0f8725095278c247df7b2f1b02bb6a082327042e0cb5d997233c6"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"
