SUMMARY = "A Qt5 library with input/output helpers"

LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bd7b2c994af21d318bd2cd3b3f80c2d5"

inherit cmake_qt5

SRC_URI = "git://github.com/ZeraGmbH/qtiohelper.git;protocol=https;branch=master"

DEPENDS += "qtbase qtserialport"

PV = "0.4.0+git${SRCPV}"
SRCREV = "5c28d4765ce7de57702f4f529fed7da80b82e8d8"

S="${WORKDIR}/git"
