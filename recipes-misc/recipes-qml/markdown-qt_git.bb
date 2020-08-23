SUMMARY = "A Qt/Qml wrapper library for markdown libraries cmark and sundown"
LICENSE = "GPLv3 & BSD-2-Clause & MIT & SUNDOWN"
LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=5b4473596678d62d9d83096273422c8c \
    file://LICENSE.cmarkdown-gfm;md5=81f9cae6293cc0345a9144b78152ab62 \
    file://LICENSE.github-markdown-css;md5=d5f2a6dd0192dcc7c833e50bb9017337 \
    file://LICENSE.sundown;beginline=117;endline=128;md5=2cd7bacd09353172bdd3ac13b6c59568 \
"

DEPENDS = " \
    qtbase \
    qtdeclarative \
    qtwebengine \
    cmark \
"

SRC_URI = "gitsm://github.com/schnitzeltony/markdown-qt.git"
SRCREV = "ea5c7f27918a86ee7cf6a9ef4b3b2a38e839c19a"
PV = "0.1.1"
S = "${WORKDIR}/git"

inherit cmake_qt5

FILES_${PN} += "${libdir}/libmarkdown-qt"
