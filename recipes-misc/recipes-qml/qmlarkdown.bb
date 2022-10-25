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
SRCREV = "86a57fcaf407c0d854d935f077a199a95eaee70a"
PV = "0.0.1+git${SRCPV}"
S = "${WORKDIR}/git"

inherit cmake_qt5 pkgconfig
