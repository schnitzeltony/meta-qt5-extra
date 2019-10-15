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
SRC_URI[md5sum] = "957501803ec62d7f09b0d728e2e5442f"
SRC_URI[sha256sum] = "6cf410dd8286e9d6b26e10d8ba297d36d13c93a329c463326b47f0bffeb3c4c2"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"
