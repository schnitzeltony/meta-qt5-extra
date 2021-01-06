SUMMARY = "Integration plugins for wayland windowing system"
DESCRIPTION = "Provides integration plugins for various KDE frameworks for the wayland windowing system"
LICENSE = "LGPL-2.1"
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
SRC_URI[sha256sum] = "33f364670a1c19b84fe1bda40e543ebcc9e7593e932a7d18b9815f150ac21f67"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"
