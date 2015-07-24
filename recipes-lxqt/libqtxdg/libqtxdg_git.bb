SUMMARY = "libqtxdg is An Qt implementation of freedesktop.org xdg specifications"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

inherit lxqt cmake-lib

# libmagic is supplied by file
DEPENDS += "file"

SRCREV = "194df9fc35ebe77597a62983bb42ad7ac20a023a"
PV = "1.2.0+git${SRCPV}"

CMAKE_ALIGN_SYSROOT[1] = "qt5xdg, -S${includedir}, -S${STAGING_INCDIR}"
CMAKE_ALIGN_SYSROOT[2] = "qt5xdg, -S${libdir}, -S${STAGING_LIBDIR}"
