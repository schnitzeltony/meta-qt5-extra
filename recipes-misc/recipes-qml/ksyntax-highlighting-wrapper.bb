SUMMARY = "Meta-Object (QML) wrapper for KSyntaxHighlighting"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://COPYING.LGPL-3;md5=e6a600fd5e1d9cbde2d983680233ad02"

DEPENDS = " \
    qtdeclarative \
    syntax-highlighting \
"

SRC_URI = "git://github.com/schnitzeltony/ksyntax-highlighting-wrapper.git"
SRCREV = "f309a268588cabd85791569fe9e63a63f79163c8"
PV = "0.1.2"
S = "${WORKDIR}/git"

inherit cmake_qt5
