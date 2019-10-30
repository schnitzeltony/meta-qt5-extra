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
SRC_URI[md5sum] = "3e30607fd3b77efccc23beea2e79c4a7"
SRC_URI[sha256sum] = "27740c241d7b14ce4ac9d7b999d8ed75011a68fdfc8f2a3df662d6078ed123a7"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"
