SUMMARY = "A Qt5 library to write cross-platform clients for Matrix"
HOMEPAGE = "https://matrix.org/docs/projects/sdk/quotient"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=243b725d71bb5df4a1e5920b344b86ad"

SRC_URI = "gitsm://github.com/quotient-im/libQuotient.git;branch=0.6.x"
SRCREV = "a4e78956f105875625b572d8b98459ffa86fafe5"
PV = "0.6.4"
S = "${WORKDIR}/git"

DEPENDS = " \
    qtbase \
    qtmultimedia \
"

inherit cmake_qt5_extra

FILES:${PN}-dev += "${datadir}/ndk-modules"

