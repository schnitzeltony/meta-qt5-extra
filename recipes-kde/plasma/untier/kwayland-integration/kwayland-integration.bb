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
SRC_URI[md5sum] = "2a2b4ede7e3e00942d78311af62ebf8f"
SRC_URI[sha256sum] = "482ee3482eca54714327a72e35deab59df15c388cef5b5cc9f4c15df9da554c6"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/kf5/*/.debug \
"
