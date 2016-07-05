SUMMARY = "A Qt5 library with input/output helpers"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bd7b2c994af21d318bd2cd3b3f80c2d5"

require recipes-qt/qt5/qt5.inc

SRC_URI = "git://github.com/schnitzeltony/${BPN}.git"

DEPENDS += "qtbase qtserialport"

PV = "0.3.0+git${SRCPV}"
SRCREV = "35ba440c928533cf9335c0c3c825f30192dee2ed"

S="${WORKDIR}/git"
