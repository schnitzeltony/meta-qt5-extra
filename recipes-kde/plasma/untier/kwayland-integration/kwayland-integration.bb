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
SRC_URI[md5sum] = "88e05b09afd5fafb7438893f967ed48e"
SRC_URI[sha256sum] = "be316bcc30e1919a9812af2794c6f78edd523fc331337f5f50361b55cbef8a58"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"
