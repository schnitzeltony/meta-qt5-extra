SUMMARY = "Components for PSS applications"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c"

inherit hawaii

DEPENDS += "plasma-framework"

SRC_URI = "git://github.com/plasma-simple-shell/${BPN}.git"
SRCREV = "292a7d4891b47f44cb3dcf896749ade9330e6ae0"
PV = "0.4.0+git${SRCPV}"

S = "${WORKDIR}/git"

FILES_${PN} += "${OE_QMAKE_PATH_QML}/PSS"
FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_QML}/PSS/*/.debug \
    ${OE_QMAKE_PATH_QML}/PSS/*/*/*/.debug \
"
