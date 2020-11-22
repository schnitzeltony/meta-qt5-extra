SUMMARY = "QML plugin with an XWayland implementation for QML compositors"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = " \
    file://LICENSE.LGPLv3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

inherit liri features_check

REQUIRED_DISTRO_FEATURES = "wayland"

PV = "0.10.0+git${SRCPV}"
SRCREV = "b6a6e6b9f56f573a41472d0a7a004e614400b111"
S = "${WORKDIR}/git"

DEPENDS += " \
    xcb-util-cursor \
    qtwayland \
"

FILES_${PN} += "${OE_QMAKE_PATH_QML}"
