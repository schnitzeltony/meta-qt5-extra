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
SRC_URI[md5sum] = "fa68691597df1d179f1806c4379bf49f"
SRC_URI[sha256sum] = "818b4e14611e26f297ef60427d399edc458a44e113bc092390fa65ecababcedb"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"
