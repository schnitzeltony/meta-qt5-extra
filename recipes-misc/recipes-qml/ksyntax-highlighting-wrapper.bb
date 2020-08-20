SUMMARY = "Meta-Object (QML) wrapper for KSyntaxHighlighting"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://COPYING.LGPL-3;md5=e6a600fd5e1d9cbde2d983680233ad02"

DEPENDS = " \
    qtdeclarative \
    syntax-highlighting \
"

SRC_URI = "git://github.com/schnitzeltony/ksyntax-highlighting-wrapper.git"
SRCREV = "6bad8796243898c6f2e166a72059cca912bc3f6c"
PV = "0.1.1"
S = "${WORKDIR}/git"

inherit cmake_qt5
