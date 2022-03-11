SUMMARY = "QML plugin with an XWayland implementation for QML compositors"
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = " \
    file://LICENSE.LGPLv3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

inherit liri features_check

REQUIRED_DISTRO_FEATURES = "wayland"

PV = "0.10.0+git${SRCPV}"
SRCREV = "98cb78ac81c18e4123fe6885b46282e5ef8dede0"
S = "${WORKDIR}/git"

DEPENDS += " \
    xcb-util-cursor \
    qtwayland \
"

FILES:${PN} += "${OE_QMAKE_PATH_QML}"
