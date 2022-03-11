SUMMARY = "Library for Liri apps"
LICENSE = "LGPL-3.0-only & GFDL-1.3"
LIC_FILES_CHKSUM = " \
	file://LICENSE.LGPLv3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
	file://LICENSE.FDL;md5=10b9de612d532fdeeb7fe8fcd1435cc6 \
"

inherit liri

PV = "0.9.0+git${SRCPV}"

SRCREV = "f332dbbfbb302d483196d98d669bd9b701941b55"
S = "${WORKDIR}/git"

FILES:${PN} += " \
    ${OE_QMAKE_PATH_QML}/Liri \
"
