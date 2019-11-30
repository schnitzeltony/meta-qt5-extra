SUMMARY = "Meta-Object (QML) wrapper for KSyntaxHighlighting"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING.LGPL-3;md5=5b4473596678d62d9d83096273422c8c \
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
