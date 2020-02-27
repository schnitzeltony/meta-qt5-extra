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
SRC_URI[md5sum] = "a596f72c6e44be6ba42d13f9a291bd03"
SRC_URI[sha256sum] = "e6a0d5eeaccd1bf6c27811b0deba2411b855bcc3f5916845e2eecb750360075d"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"
