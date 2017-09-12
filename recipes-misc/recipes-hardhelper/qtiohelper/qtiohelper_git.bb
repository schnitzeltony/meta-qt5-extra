SUMMARY = "A Qt5 library with input/output helpers"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bd7b2c994af21d318bd2cd3b3f80c2d5"

require recipes-qt/qt5/qt5.inc

SRC_URI = "git://github.com/schnitzeltony/${BPN}.git;branch=master"

DEPENDS += "qtbase qtserialport"

PV = "0.3.99+git${SRCPV}"
SRCREV = "18276235f8479ddd086671a3a4b69873e51f2361"

S="${WORKDIR}/git"
