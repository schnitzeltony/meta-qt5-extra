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
SRC_URI[md5sum] = "8bda1526aa7f9dbf6aa842b08cf22655"
SRC_URI[sha256sum] = "e9d582560becb11b2884df642dbb0796696a2d94d55e92e1d87db8d312f443a3"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"
