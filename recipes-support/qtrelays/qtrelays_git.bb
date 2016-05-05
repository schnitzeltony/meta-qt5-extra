SUMMARY = "A Qt5 library to handle relays"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bd7b2c994af21d318bd2cd3b3f80c2d5"

require recipes-qt/qt5/qt5.inc

SRC_URI = "git://github.com/schnitzeltony/${BPN}.git"

DEPENDS += "qtbase"

PV = "0.0.1+git${SRCPV}"
SRCREV = "7711cd8f2ae9f35a620a7f9aef70ce721dc1dc2a"

S="${WORKDIR}/git"
