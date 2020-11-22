SUMMARY = "Qt/C++ wrapper for ZIP/UNZIP package"
HOMEPAGE = "https://github.com/stachenov/quazip"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=910d778aab53617cbaf13c4e1810e289"

DEPENDS = "qtbase zlib"

SRC_URI = "git://github.com/stachenov/quazip.git;branch=v0.9.x"
SRCREV = "6938d8b108b09ebb14ef25542abd2d9108f8e036"
PV = "0.9.1"
S = "${WORKDIR}/git"

inherit cmake_qt5

EXTRA_CMAKE = "-DLIB_SUFFIX=${@d.getVar('baselib').replace('lib', '')}"
