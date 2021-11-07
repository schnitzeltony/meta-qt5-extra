SUMMARY = "A nicely exposed QSortFilterProxyModel for QML"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9b7d27a6488b7d63e85ccdb01e3a70a0"

DEPENDS = " \
    qtbase \
    qtdeclarative \
"

SRC_URI = "git://github.com/schnitzeltony/SortFilterProxyModel.git;branch=master;protocol=https"
SRCREV = "3931d10330dfe01eb855805fdcb0d6da5c31b024"
PV = "0.1.1+git${SRCPV}"
S = "${WORKDIR}/git"

inherit cmake_qt5 pkgconfig

EXTRA_OECMAKE += " \
    -DBUILD_OBJECT_LIB=OFF \
    -DBUILD_SHARED_LIB=ON \
"
