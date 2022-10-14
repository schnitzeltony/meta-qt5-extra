SUMMARY = "Simple WYSIWYG CommonMark(down) editor"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5b4473596678d62d9d83096273422c8c"

DEPENDS = " \
    qtdeclarative \
    qtquickcontrols2 \
    qtwebengine \
    markdown-qt \
    ksyntax-highlighting-wrapper \
    fontawesome-qml \
"

SRC_URI = "git://github.com/schnitzeltony/qmlarkdown.git;branch=master;protocol=https"
SRCREV = "b9d289be4dce951ca7188896cb5d51a6576cbe25"
PV = "0.0.1+git${SRCPV}"
S = "${WORKDIR}/git"

inherit cmake_qt5 pkgconfig
