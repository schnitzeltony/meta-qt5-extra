SUMMARY = "Meta-Object (QML) wrapper for KSyntaxHighlighting"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://COPYING.LGPL-3;md5=e6a600fd5e1d9cbde2d983680233ad02"

DEPENDS = " \
    qtdeclarative \
    syntax-highlighting \
"

SRC_URI = "git://github.com/schnitzeltony/ksyntax-highlighting-wrapper.git;branch=master;protocol=https"
SRCREV = "7f2f6d3d030cc0ed7beca43d3e7668a30f123ba1"
PV = "0.2.0"
S = "${WORKDIR}/git"

inherit cmake_qt5 pkgconfig
