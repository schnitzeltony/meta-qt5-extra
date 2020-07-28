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
SRC_URI[md5sum] = "b471f4de79180257d05baebb6b9b587e"
SRC_URI[sha256sum] = "aba501cf82d2ca5247fe1f3aa93ab40df6daf549cd3a1f001dd81f355901f37b"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"
