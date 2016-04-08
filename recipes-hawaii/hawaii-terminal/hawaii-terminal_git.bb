SUMMARY = "Terminal emulator for the Hawaii desktop environment"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE.GPLv2;md5=b234ee4d69f5fce4486a80fdaf4a4263"

inherit hawaii

SRCREV = "8c4701aa6e9223091ac3ad1fb0e8005c92399fee"
PV = "0.6.90+git${SRCPV}"

S = "${WORKDIR}/git"

FILES_${PN} += " \
    ${datadir}/appdata \
    ${OE_QMAKE_PATH_QML}/Hawaii/Terminal \
"
