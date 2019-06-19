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
SRC_URI[md5sum] = "522820d7b4e7b255acc1646d36c5c2f0"
SRC_URI[sha256sum] = "a519924e719d08a7ed81a84f18650cac0c46d2866e825ca8d102582fad9e6bd1"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"
