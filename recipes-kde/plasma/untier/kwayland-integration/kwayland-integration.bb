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
SRC_URI[md5sum] = "c9ecb33741371db269426089f5701316"
SRC_URI[sha256sum] = "661a412bc9a37018ec30843b36af25c49816449a681e707a8c3dad0cbf531679"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"
