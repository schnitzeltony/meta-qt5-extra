SUMMARY = "Tomahawk, the multi-source music player"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=9eef91148a9b14ec7f9df333daebc746"

DEPENDS += " \
    qtbase \
    quazip \
    taglib \
"

SRC_URI = " \
    git://github.com/tomahawk-player/${BPN}.git;protocol=git \
    file://0001-use-pkg-config-to-find-taglib.patch \
"
SRCREV = "7e96285132921936b3a62202d894d5288e5890d2"
PV ="0.8.99+git${SRCPV}"

S = "${WORKDIR}/git"

inherit cmake_qt5

CMAKE_FLAGS = " \
    -DQUAZIP_INCLUDE_DIRS=${includedir}/quazip \
    -DQUAZIP_LIBRARIES=${libdir} \
"
