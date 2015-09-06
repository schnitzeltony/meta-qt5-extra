SUMMARY = "Styles for applications using QtQuick Controls"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE.LGPL;md5=4fbd65380cdd255951079008b364516c"

inherit hawaii

SRCREV = "bc6678a242a8439488e0f57ddefdbb1eed5eabf2"
PV = "0.5.0+git${SRCPV}"

S = "${WORKDIR}/git"

FILES_${PN} += " \
    ${datadir}/color-schemes \
    ${OE_QMAKE_PATH_QML} \
"
