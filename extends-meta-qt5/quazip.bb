SUMMARY = "Qt/C++ wrapper for ZIP/UNZIP package"
HOMEPAGE = "https://github.com/stachenov/quazip"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=af67f05b2b6abf61e608dcfccb94b3e1"

DEPENDS = "qtbase zlib"

SRC_URI = "git://github.com/stachenov/quazip.git;branch=master;protocol=https"
SRCREV = "6117161af08e366c37499895b00ef62f93adc345"
PV = "1.3"
S = "${WORKDIR}/git"

inherit cmake_qt5

EXTRA_CMAKE = "-DLIB_SUFFIX=${@d.getVar('baselib').replace('lib', '')}"
