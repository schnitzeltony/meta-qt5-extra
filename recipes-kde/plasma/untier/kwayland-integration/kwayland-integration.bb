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
SRC_URI[md5sum] = "4c029d5a2e0dec0c9ca746d910393ae3"
SRC_URI[sha256sum] = "8dec5719104a551fc8c1d6249568accedce9b8d18691d818f2b7abc13f21fd17"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"
