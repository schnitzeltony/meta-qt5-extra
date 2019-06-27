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
SRC_URI[md5sum] = "8b67efbdea3ace65525d2e1359ffc308"
SRC_URI[sha256sum] = "dddd4bba1c547d59cf2adbdeab4f6d8f9647e086715e08035d9396e234c63ccd"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"
