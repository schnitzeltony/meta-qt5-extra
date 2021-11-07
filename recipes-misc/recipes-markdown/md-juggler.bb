SUMMARY = "Qt markdown report generator "
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=5b4473596678d62d9d83096273422c8c \
"

DEPENDS = " \
    qtbase \
"

SRC_URI = "git://github.com/schnitzeltony/md-juggler.git;branch=master;protocol=https"
SRCREV = "db9094b328863e301a0e691c7412befd84c17e7b"
PV = "0.0.0+git${SRCPV}"
S = "${WORKDIR}/git"

inherit cmake_qt5
