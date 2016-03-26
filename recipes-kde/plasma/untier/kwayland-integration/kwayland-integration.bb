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
SRC_URI[md5sum] = "d0a617777fc8793e685e0ea1cba5eda9"
SRC_URI[sha256sum] = "868c5660741fecb54bdab0ea936097c25c1b303f06cf1e7be9b80b0288db0dfb"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/kf5/*/.debug \
"
