SUMMARY = "A qt5 library with input/output helpers"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bd7b2c994af21d318bd2cd3b3f80c2d5"

require recipes-qt/qt5/qt5.inc

SRC_URI = "git://github.com/schnitzeltony/qtiohelper.git"

DEPENDS += "qtbase"

PV = "0.1.0+git${SRCPV}"
SRCREV = "6297d097f4c98460ee8baf887afd9c612bcffa04"

S="${WORKDIR}/git"
