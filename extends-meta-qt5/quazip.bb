SUMMARY = "Qt/C++ wrapper for ZIP/UNZIP package"
HOMEPAGE = "https://github.com/stachenov/quazip"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=4c01c380a79ed7138aa9049e29df9c6a"

DEPENDS = "qtbase zlib"

SRC_URI = "git://github.com/stachenov/quazip.git;branch=master;protocol=https"
SRCREV = "100578f686b7da029a19c0bc9ad3c93f80adb2bb"
PV = "1.1"
S = "${WORKDIR}/git"

inherit cmake_qt5

EXTRA_CMAKE = "-DLIB_SUFFIX=${@d.getVar('baselib').replace('lib', '')}"
