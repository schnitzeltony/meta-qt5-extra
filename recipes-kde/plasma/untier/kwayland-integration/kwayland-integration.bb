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
SRC_URI[md5sum] = "f884e200e14299031f2948215cecf20d"
SRC_URI[sha256sum] = "4f7b0ad0a0fb57068e971235c59f041153663562cf876bdd8c4182e6f4adab4e"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"
