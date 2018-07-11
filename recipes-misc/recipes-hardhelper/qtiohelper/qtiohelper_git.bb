SUMMARY = "A Qt5 library with input/output helpers"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bd7b2c994af21d318bd2cd3b3f80c2d5"

require recipes-qt/qt5/qt5.inc

SRC_URI = "git://github.com/schnitzeltony/${BPN}.git;branch=master"

DEPENDS += "qtbase qtserialport"

PV = "0.3.994+git${SRCPV}"
SRCREV = "256024e70932966a626f011144dd1b37c1e65f59"

S="${WORKDIR}/git"
