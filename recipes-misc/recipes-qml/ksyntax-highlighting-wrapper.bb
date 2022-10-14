SUMMARY = "Meta-Object (QML) wrapper for KSyntaxHighlighting"
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING.LGPL-3;md5=e6a600fd5e1d9cbde2d983680233ad02"

DEPENDS = " \
    qtdeclarative \
    syntax-highlighting \
"

SRC_URI = "git://github.com/schnitzeltony/ksyntax-highlighting-wrapper.git;branch=master;protocol=https"
SRCREV = "24e8a3610635b17e6dbeeeb8388d7e58624a10c0"
PV = "0.2.0+git${SRCPV}"
S = "${WORKDIR}/git"

inherit cmake_qt5 pkgconfig
