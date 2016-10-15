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
SRC_URI[md5sum] = "eda80bdc28bee8bcfb4fc122168b36af"
SRC_URI[sha256sum] = "307688799889e4d6dbecdd811397a3167cab17b9d0d50de3fff96433cfa68de3"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/kf5/*/.debug \
"
