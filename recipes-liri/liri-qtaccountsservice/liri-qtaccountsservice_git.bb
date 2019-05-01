SUMMARY = "Qt-style API to use freedesktop.org's AccountsService DBus service"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = " \
    file://LICENSE.LGPLv3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

inherit liri

PV = "1.3.0+git${SRCPV}"
SRCREV = "33b322922508d9c9b84bca5345ac4f8dd9b56761"
S = "${WORKDIR}/git"

FILES_${PN} += "${OE_QMAKE_PATH_QML}"
