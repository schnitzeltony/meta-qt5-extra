SUMMARY = "Meta-Object (QML) wrapper for KSyntaxHighlighting"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING.LGPL-3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

DEPENDS = " \
    qtdeclarative \
    syntax-highlighting \
"


SRC_URI = "git://github.com/schnitzeltony/ksyntax-highlighting-wrapper.git"
SRCREV = "a27b4284942f2f46c6776c32b8abb69dbbc43a85"
PV = "0.0.1+git${SRCPV}"
S = "${WORKDIR}/git"

inherit cmake_qt5
