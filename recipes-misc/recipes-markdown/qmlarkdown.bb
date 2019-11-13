SUMMARY = "Simple WYSIWYG CommonMark(down) editor "
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=5b4473596678d62d9d83096273422c8c \
"

DEPENDS = " \
    markdown-qt \
    qtdeclarative \
    qtquickcontrols2 \
    qtwebengine \
"

SRC_URI = "gitsm://github.com/schnitzeltony/qmlarkdown.git"
SRCREV = "da21e9750f2b0ba6e8091f2a94336906bc2bc2de"
PV = "0.0.0+git${SRCPV}"
S = "${WORKDIR}/git"

inherit cmake_qt5
