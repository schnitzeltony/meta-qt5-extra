SUMMARY = "A Qt/Qml wrapper library for markdown libraries cmark and sundown"
LICENSE = "GPLv3 & MIT & SUNDOWN"
LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=5b4473596678d62d9d83096273422c8c \
    file://LICENSE.github-markdown-css;md5=915042b5df33c31a6db2b37eadaa00e3 \
    file://LICENSE.sundown;beginline=117;endline=128;md5=2cd7bacd09353172bdd3ac13b6c59568 \
"

DEPENDS = " \
    qtbase \
    qtdeclarative \
    cmark \
"

SRC_URI = "gitsm://github.com/schnitzeltony/markdown-qt.git"
SRCREV = "850ff2e313ec7f0bf3ea2882048a4e358bbd83d9"
PV = "0.0.1+git${SRCPV}"
S = "${WORKDIR}/git"

inherit cmake_qt5

FILES_${PN} += "${libdir}/libmarkdown-qt"
