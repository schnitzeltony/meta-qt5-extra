SUMMARY = "A library to ease up Font-Awesome handling in QML"
LICENSE = "GPL-3.0-only & OFL-1.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fecd21dee2128ddcc4579bc72ad08b80"

DEPENDS = " \
    qtdeclarative \
    qtquickcontrols2 \
    sortfilterproxymodel \
"

SRC_URI = "gitsm://github.com/schnitzeltony/fontawesome-qml.git;branch=master;protocol=https"
SRCREV = "b4ed78971807db222644af2669d734e4dccc52dd"
PV = "0.3.0"
S = "${WORKDIR}/git"

inherit cmake_qt5 pkgconfig
