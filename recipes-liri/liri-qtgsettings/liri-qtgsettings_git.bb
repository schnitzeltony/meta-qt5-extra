SUMMARY = "Qt wrapper for GSettings"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = " \
    file://LICENSE.LGPLv3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

inherit liri

DEPENDS += "glib-2.0"

PV = "1.0.0+git${SRCPV}"
SRCREV = "3132cd4e46d8a2069594e36cb5be1eac36727a6a"
S = "${WORKDIR}/git"

FILES_${PN} += "${OE_QMAKE_PATH_QML}"

RDEPENDS_${PN} += "dconf"
