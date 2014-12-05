SUMMARY = "Archiver is a compressed archives manager for the Hawaii desktop environment"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

inherit cmake_qt5

DEPENDS = "qtbase qttools karchive"

SRC_URI = "git://github.com/mauios/${BPN}.git;protocol=git;branch=dev"
SRCREV = "2a14d5a0cd4f2d6fdba80b4fe657d6d9962fb4b3"
PV = "0.0.0+git${SRCPV}"

S = "${WORKDIR}/git"

EXTRA_OECMAKE += "-DQt5LinguistTools_DIR=${STAGING_LIBDIR_NATIVE}/cmake/Qt5LinguistTools"
