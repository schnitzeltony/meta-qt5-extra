SUMMARY = "Libraries for text templating with Qt"
HOMEPAGE = "https://github.com/steveire/grantlee"
LICENSE = "LGPLv2.1+"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

SRC_URI = " \
    http://downloads.grantlee.org/${BPN}-${PV}.tar.gz \
    file://0001-rework-qCWarning-to-fix-build-with-gcc-6.patch \
"
SRC_URI[md5sum] = "57989ae9f7c113e682ef1713a6f1e92a"
SRC_URI[sha256sum] = "ea2e402466c74bb533eee2c7252209ec61cd93a5d236fecd625b4a0eb13a1478"

inherit cmake_qt5 pkgconfig

DEPENDS += "qtscript"

FILES_${PN}-dev += "${libdir}/cmake"
FILES_${PN}-dbg += "${libdir}/grantlee/*/.debug"
