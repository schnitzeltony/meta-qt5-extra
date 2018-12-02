SUMMARY = "Qt-style API to use freedesktop.org's AccountsService DBus service"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = " \
    file://LICENSE.LGPLv3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

inherit liri

PV = "1.2.0+git${SRCPV}"
SRCREV = "a92567854891555226501ba200bf4faabc16c4c9"
S = "${WORKDIR}/git"

FILES_${PN} += "${OE_QMAKE_PATH_QML}"
