SUMMARY = "libqtxdg is An Qt implementation of freedesktop.org xdg specifications"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

inherit lxqt cmake-lib

# libmagic is supplied by file
DEPENDS += "file"

SRCREV = "d1bae674d698be6e2949b65c99ab06093cbe9600"
PV = "1.2.0+git${SRCPV}"

CMAKE_ALIGN_SYSROOT[1] = "qt5xdg, -S${includedir}, -S${STAGING_INCDIR}"
CMAKE_ALIGN_SYSROOT[2] = "qt5xdg, -S${libdir}, -S${STAGING_LIBDIR}"
