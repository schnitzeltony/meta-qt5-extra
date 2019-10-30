SUMMARY = "Simple WYSIWYG CommonMark(down) editor "
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=5b4473596678d62d9d83096273422c8c \
"

DEPENDS = " \
    cmark \
    qtbase \
    qtdeclarative \
    qtquickcontrols2 \
    qtwebengine \
"

SRC_URI = "gitsm://github.com/schnitzeltony/qmlarkdown.git"
SRCREV = "2ccb24c4c48b80589f59d95f511f54ea8cc06801"
PV = "0.0.0+git${SRCPV}"
S = "${WORKDIR}/git"

inherit cmake_qt5
