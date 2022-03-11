SUMMARY = "Qt wrapper for GSettings"
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = " \
    file://LICENSE.LGPLv3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

inherit liri

DEPENDS += "glib-2.0"

PV = "1.3.0+git${SRCPV}"
SRCREV = "7fb2af5b997d2583ffda40872880138b1cb7bcb4"
S = "${WORKDIR}/git"

FILES:${PN} += "${OE_QMAKE_PATH_QML}"

RDEPENDS:${PN} += "dconf"
