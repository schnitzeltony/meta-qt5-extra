SUMMARY = "A Qt5 library with input/output helpers"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bd7b2c994af21d318bd2cd3b3f80c2d5"

require recipes-qt/qt5/qt5.inc

SRC_URI = "git://github.com/schnitzeltony/${BPN}.git"

DEPENDS += "qtbase"

PV = "0.1.0+git${SRCPV}"
SRCREV = "d05c789a7f8f99ece9bfe14402065c40ab8a9b00"

S="${WORKDIR}/git"
