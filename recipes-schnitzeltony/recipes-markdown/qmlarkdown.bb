SUMMARY = "Simple WYSIWYG CommonMark(down) editor"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=5b4473596678d62d9d83096273422c8c \
"

DEPENDS = " \
    qtdeclarative \
    qtquickcontrols2 \
    qtwebengine \
    markdown-qt \
    ksyntax-highlighting-wrapper \
    fontawesome-qml \
"

SRC_URI = "git://github.com/schnitzeltony/qmlarkdown.git"
SRCREV = "fd47a751e7bc7a00f8c9738131280ba2831397c7"
PV = "0.0.1+git${SRCPV}"
S = "${WORKDIR}/git"

inherit cmake_qt5
