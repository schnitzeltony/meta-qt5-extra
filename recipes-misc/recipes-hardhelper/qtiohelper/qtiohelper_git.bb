SUMMARY = "A Qt5 library with input/output helpers"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bd7b2c994af21d318bd2cd3b3f80c2d5"

require recipes-qt/qt5/qt5.inc

SRC_URI = "git://github.com/schnitzeltony/${BPN}.git"

DEPENDS += "qtbase qtserialport"

PV = "0.1.0+git${SRCPV}"
SRCREV = "30626f2c812efe124e084e74004a2d6ead8f6ca7"

S="${WORKDIR}/git"
