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
SRCREV = "5185c30f6897aa956dd527542389090a4c4b18e2"
PV = "0.0.1+git${SRCPV}"
S = "${WORKDIR}/git"

inherit cmake_qt5
