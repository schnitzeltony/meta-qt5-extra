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
SRC_URI[md5sum] = "f6caa82ddb732e2d51e2c93c993c470e"
SRC_URI[sha256sum] = "cefcc75a967228469bb72dd763655c94cc59ce067e01c0eff1fda25c30fcac48"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/kf5/*/.debug \
"
