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
SRC_URI[md5sum] = "1d5fc2b4e6488bd8c55206a3c08182d9"
SRC_URI[sha256sum] = "6e760090dd68aa5fbd4ec2c01c7a277ef15310108fa4368bee82c6f57e8dcd99"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"
