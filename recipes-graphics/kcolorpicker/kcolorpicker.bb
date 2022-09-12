SUMMARY = "Qt based Color Picker with popup menu"
HOMEPAGE = "https://github.com/ksnip/kColorPicker"
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3000208d539ec061b899bce1d9ce9404"

SRC_URI = "git://github.com/ksnip/kColorPicker.git;branch=master;protocol=https"
SRCREV = "15e16374e51153006d3400cb88066d5272698743"
PV = "0.2.0"
S = "${WORKDIR}/git"

DEPENDS = " \
    qtbase \
"

inherit cmake_qt5_extra pkgconfig

EXTRA_OECMAKE += "-DBUILD_SHARED_LIBS=ON"
