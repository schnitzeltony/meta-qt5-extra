SUMMARY = "Qt-style API to use freedesktop.org's AccountsService DBus service"
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = " \
    file://LICENSE.LGPLv3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

inherit liri

PV = "1.3.0+git${SRCPV}"
SRCREV = "e8a99501d0822cda2997b44307396bc5878b82e4"
S = "${WORKDIR}/git"

FILES:${PN} += "${OE_QMAKE_PATH_QML}"
