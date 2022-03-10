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
SRCREV = "1ee12b14c3c34297a96d8c97490671235a33fc8e"
PV = "0.0.1+git${SRCPV}"
S = "${WORKDIR}/git"

inherit cmake_qt5 pkgconfig
