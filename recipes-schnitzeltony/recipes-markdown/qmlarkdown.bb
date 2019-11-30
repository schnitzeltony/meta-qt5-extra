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
"

SRC_URI = "gitsm://github.com/schnitzeltony/qmlarkdown.git"
SRCREV = "9667c550fa2ffcf0ecc549f02e7eca6b98ac5011"
PV = "0.0.1+git${SRCPV}"
S = "${WORKDIR}/git"

inherit cmake_qt5
