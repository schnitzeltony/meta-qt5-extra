SUMMARY = "Qt-style API to use freedesktop.org's AccountsService DBus service"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = " \
    file://LICENSE.LGPLv3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

inherit liri

PV = "1.3.0+git${SRCPV}"
SRCREV = "15ad06ccaf3c74a33a2b0f67438d218cd88cc8d2"
S = "${WORKDIR}/git"

FILES:${PN} += "${OE_QMAKE_PATH_QML}"
