SUMMARY = "A library to ease up Font-Awesome handling in QML"
LICENSE = "GPLv3 & OFL-1.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fecd21dee2128ddcc4579bc72ad08b80"

DEPENDS = " \
    qtdeclarative \
    qtquickcontrols2 \
"

SRC_URI = "gitsm://github.com/schnitzeltony/fontawesome-qml.git"
SRCREV = "9a6b406223a8d2640f37a1259a013565eaba2872"
PV = "0.1.0"
S = "${WORKDIR}/git"

inherit cmake_qt5
