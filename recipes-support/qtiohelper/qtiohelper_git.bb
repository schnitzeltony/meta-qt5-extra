SUMMARY = "A qt5 library with input/output helpers"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bd7b2c994af21d318bd2cd3b3f80c2d5"

require recipes-qt/qt5/qt5.inc

SRC_URI = "git://github.com/schnitzeltony/qtiohelper.git"

DEPENDS += "qtbase"

PV = "0.1.0+git${SRCPV}"
SRCREV = "c9e3b9ceb466afde189df2d4f574815072eb697a"

S="${WORKDIR}/git"
