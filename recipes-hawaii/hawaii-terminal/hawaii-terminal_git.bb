SUMMARY = "Terminal emulator for the Hawaii desktop environment"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

inherit hawaii

SRCREV = "fc35b8a44e55334dcecdec8cf6e80047fe056727"
PV = "0.5.91+git${SRCPV}"

S = "${WORKDIR}/git"

FILES_${PN} += " \
    ${datadir}/appdata \
    ${OE_QMAKE_PATH_QML}/Hawaii/Terminal \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_QML}/Hawaii/Terminal/*/.debug \
"
