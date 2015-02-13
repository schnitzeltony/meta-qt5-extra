SUMMARY = "GUI configuration tool for compton X composite manager"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

inherit lxqt pkgconfig

DEPENDS += "libconfig"

SRCREV = "3bd14bc34f7731812f3f2833bd4d796ecb36caa0"
PV = "0.1.0+git${SRCPV}"

SRC_URI += "file://0001-CMakeLists.txt-do-not-completely-overwrite-CMAKE_CXX.patch"

EXTRA_OECMAKE += "-DUSE_QT5=ON"
