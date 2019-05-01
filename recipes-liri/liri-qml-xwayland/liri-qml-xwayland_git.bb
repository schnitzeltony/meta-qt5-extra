SUMMARY = "QML plugin with an XWayland implementation for QML compositors"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = " \
    file://LICENSE.LGPLv3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

inherit liri distro_features_check

REQUIRED_DISTRO_FEATURES = "wayland"

PV = "0.10.0+git${SRCPV}"
SRCREV = "ae2e1f3752851caf950134a075a087704306b18a"
S = "${WORKDIR}/git"

DEPENDS += " \
    xcb-util-cursor \
    qtwayland \
"

FILES_${PN} += "${OE_QMAKE_PATH_QML}"
