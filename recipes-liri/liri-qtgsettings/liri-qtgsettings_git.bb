SUMMARY = "Qt wrapper for GSettings"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = " \
    file://LICENSE.LGPLv3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

inherit liri

DEPENDS += "glib-2.0"

PV = "1.3.0+git${SRCPV}"
SRCREV = "fc0826043b487aa7df794fce6f152f6eceb9e5ce"
S = "${WORKDIR}/git"

FILES_${PN} += "${OE_QMAKE_PATH_QML}"

RDEPENDS_${PN} += "dconf"
