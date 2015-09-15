SUMMARY = "Library used to query system info and statistics "
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

inherit lxqt cmake-lib

SRCREV = "e58d8be655bf631f0695e2d790e7d1a94faf8c94"
PV = "0.3.0+git${SRCPV}"

CMAKE_ALIGN_SYSROOT[1] = "sysstat-qt5, -S${includedir}, -S${STAGING_INCDIR}"
CMAKE_ALIGN_SYSROOT[2] = "sysstat-qt5, -S${libdir}, -S${STAGING_LIBDIR}"
