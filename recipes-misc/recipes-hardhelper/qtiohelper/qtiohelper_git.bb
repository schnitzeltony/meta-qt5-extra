SUMMARY = "A Qt5 library with input/output helpers"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bd7b2c994af21d318bd2cd3b3f80c2d5"

require recipes-qt/qt5/qt5.inc

SRC_URI = "git://github.com/schnitzeltony/${BPN}.git;branch=master"

DEPENDS += "qtbase qtserialport"

PV = "0.3.990+git${SRCPV}"
SRCREV = "4f6eb0f7a310e5887f45d45f2d06401f6e7f7c04"

S="${WORKDIR}/git"
