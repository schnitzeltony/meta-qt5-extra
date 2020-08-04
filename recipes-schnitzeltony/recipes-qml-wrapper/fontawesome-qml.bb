SUMMARY = "A library to ease up Font-Awesome handling in QML"
LICENSE = "GPLv3 & OFL-1.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cb0c48d9cdd3c75b1a0182323dbda5a7"

DEPENDS = " \
    qtdeclarative \
    qtquickcontrols2 \
"


SRC_URI = "gitsm://github.com/schnitzeltony/fontawesome-qml.git"
SRCREV = "d2b6df4de4cc8fe19002d0ea9bde3be0e64a28a2"
PV = "0.0.1+git${SRCPV}"
S = "${WORKDIR}/git"

inherit cmake_qt5
