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
SRC_URI[md5sum] = "95e8f7c97d92ce842f4cd88e4244164f"
SRC_URI[sha256sum] = "f15ae33af1d9ff999ec45d00752f202242f71fc022ae72b9522e5bf3a20edace"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"
