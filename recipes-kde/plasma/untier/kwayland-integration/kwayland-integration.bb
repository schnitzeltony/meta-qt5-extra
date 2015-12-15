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
    kwayland \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "1ca9cb1238c44af26b7cf74d5eb69cb4"
SRC_URI[sha256sum] = "ae649db9c158efcc3c170a2f7deb7e249bcb6eb3557e032d913d7d1d3b4b41eb"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/kf5/*/.debug \
"
