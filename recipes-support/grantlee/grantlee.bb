SUMMARY = "Libraries for text templating with Qt"
HOMEPAGE = "https://github.com/steveire/grantlee"
LICENSE = "LGPL-2.1-or-later"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

SRC_URI = "git://github.com/steveire/grantlee.git;branch=master;protocol=https"
SRCREV = "1f2fead003c7804ad79eddb1ebf685dab8f00180"
S = "${WORKDIR}/git"

PV = "5.3.0"

inherit cmake_qt5 pkgconfig

DEPENDS += "qtscript"

EXTRA_OECMAKE += " \
    -DLIB_SUFFIX=${@d.getVar('baselib').replace('lib', '')} \
    -DBUILD_TESTS=OFF \
"
