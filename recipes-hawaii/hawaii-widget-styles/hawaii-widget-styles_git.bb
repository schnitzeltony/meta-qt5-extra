SUMMARY = "Styles for applications using QtQuick Controls"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE.LGPL;md5=4fbd65380cdd255951079008b364516c"

inherit hawaii

SRCREV = "9aaaf3b8681dc2253d812aa7f37b8ed5e1651959"
PV = "0.8.0"

S = "${WORKDIR}/git"

FILES_${PN} += " \
    ${datadir}/color-schemes \
    ${OE_QMAKE_PATH_QML} \
"
