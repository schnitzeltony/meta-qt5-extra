SUMMARY = "A library to ease up Font-Awesome handling in QML"
LICENSE = "GPLv3 & OFL-1.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fecd21dee2128ddcc4579bc72ad08b80"

DEPENDS = " \
    qtdeclarative \
    qtquickcontrols2 \
    sortfilterproxymodel \
"

SRC_URI = "gitsm://github.com/schnitzeltony/fontawesome-qml.git"
SRCREV = "28cca2cc1f10893d8c6c6facca64f5897b08cc2d"
PV = "0.2.2"
S = "${WORKDIR}/git"

inherit cmake_qt5
