SUMMARY = "Styles for applications using QtQuick Controls"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE.LGPL;md5=4fbd65380cdd255951079008b364516c"

inherit hawaii

SRCREV = "b1e5148dc4c7a422aed096b6d9647f7ba2673569"

S = "${WORKDIR}/git"

FILES_${PN} += " \
    ${datadir}/color-schemes \
    ${OE_QMAKE_PATH_QML} \
"
