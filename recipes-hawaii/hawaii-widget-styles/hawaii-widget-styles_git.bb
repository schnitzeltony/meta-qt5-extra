SUMMARY = "Styles for applications using QtQuick Controls"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE.LGPL;md5=4fbd65380cdd255951079008b364516c"

inherit hawaii

SRCREV = "20ffdadd04e9f98124ea14690fdf89d7567956c2"
PV = "0.6.90+git${SRCPV}"

S = "${WORKDIR}/git"

FILES_${PN} += " \
    ${datadir}/color-schemes \
    ${OE_QMAKE_PATH_QML} \
"
