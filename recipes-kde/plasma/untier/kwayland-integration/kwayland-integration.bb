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
SRC_URI[md5sum] = "f5ceb5dbfcf2d3f590b9115c446b35df"
SRC_URI[sha256sum] = "7000f3fc7802e8dc9cb0825fd2cc4c5e2619e80fa12536e4e7cfdd33ad4b2b3f"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"
