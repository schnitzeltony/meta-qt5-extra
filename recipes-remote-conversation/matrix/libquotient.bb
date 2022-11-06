SUMMARY = "A Qt5 library to write cross-platform clients for Matrix"
HOMEPAGE = "https://matrix.org/docs/projects/sdk/quotient"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=243b725d71bb5df4a1e5920b344b86ad"

SRC_URI = "gitsm://github.com/quotient-im/libQuotient.git;branch=0.6.x;protocol=https"
SRCREV = "0a342369406e2d259ce20e5fa6d53ac271cbf3c2"
PV = "0.6.11"
S = "${WORKDIR}/git"

DEPENDS = " \
    qtbase \
    qtmultimedia \
"

inherit cmake_qt5_extra

FILES:${PN}-dev += "${datadir}/ndk-modules"

