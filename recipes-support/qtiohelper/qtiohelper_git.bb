SUMMARY = "A qt5 library with input/output helpers"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bd7b2c994af21d318bd2cd3b3f80c2d5"

require recipes-qt/qt5/qt5.inc

SRC_URI = "git://github.com/schnitzeltony/qtiohelper.git"

DEPENDS += "qtbase"

PV = "0.0.1+git${SRCPV}"
SRCREV = "2b26d6e95fc0c651ee80982ec0dba775462e1d32"

S="${WORKDIR}/git"
