SUMMARY = "Libraries for text templating with Qt"
HOMEPAGE = "https://github.com/steveire/grantlee"
LICENSE = "LGPLv2.1+"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

SRC_URI = "git://github.com/steveire/grantlee.git"
SRCREV = "b6454a97c9db3275f1a147a4dde1a02894dfbba0"
S = "${WORKDIR}/git"

PV = "5.2.0"

inherit cmake_qt5 pkgconfig

DEPENDS += "qtscript"

EXTRA_OECMAKE += " \
    -DLIB_SUFFIX=${@d.getVar('baselib').replace('lib', '')} \
    -DBUILD_TESTS=OFF \
"
