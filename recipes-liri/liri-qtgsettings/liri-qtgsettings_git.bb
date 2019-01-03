SUMMARY = "Qt wrapper for GSettings"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = " \
    file://LICENSE.LGPLv3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

inherit liri

DEPENDS += "glib-2.0"

PV = "1.0.0+git${SRCPV}"
SRCREV = "a368ce3564fd8715e50ecae52a862d30f565ad97"
S = "${WORKDIR}/git"

FILES_${PN} += "${OE_QMAKE_PATH_QML}"

RDEPENDS_${PN} += "dconf"
