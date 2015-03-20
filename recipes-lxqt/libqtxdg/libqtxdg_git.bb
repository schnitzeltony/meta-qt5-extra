SUMMARY = "libqtxdg is An Qt implementation of freedesktop.org xdg specifications"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

inherit lxqt cmake-lib

# libmagic is supplied by file
DEPENDS += "file"

SRCREV = "87fb74a1e7618ba199b977ee0d1ac341a3c13ee6"
PV = "1.1.0"

EXTRA_OECMAKE += "-DCMAKE_INSTALL_PREFIX=''"

CMAKE_ALIGN_SYSROOT[1] = "qt5xdg, -S${includedir}, -S${STAGING_INCDIR}"
CMAKE_ALIGN_SYSROOT[2] = "qt5xdg, -S${libdir}, -S${STAGING_LIBDIR}"
