SUMMARY = "A lightweight compositor for X11"
HOMEPAGE = "https://github.com/ksnip/kImageAnnotator"
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3000208d539ec061b899bce1d9ce9404"

SRC_URI = "git://github.com/ksnip/kImageAnnotator.git;branch=master;protocol=https"
SRCREV = "6651dc09ccbf277359669141669ccc9e6a9f2cc2"
PV = "0.2.0"
S = "${WORKDIR}/git"

DEPENDS = " \
    qttools-native \
    qtsvg \
    kcolorpicker \
"

inherit cmake_qt5_extra pkgconfig qt5-translation

EXTRA_OECMAKE += "-DBUILD_SHARED_LIBS=ON"
