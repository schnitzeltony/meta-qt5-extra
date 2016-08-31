SUMMARY = "Library used to query system info and statistics "
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt cmake_lib

SRCREV = "7b173f36872f5943792b61ef760ee3ed8da4e3ae"
PV = "0.3.1"

CMAKE_ALIGN_SYSROOT[1] = "sysstat-qt5, -S${includedir}, -S${STAGING_INCDIR}"
CMAKE_ALIGN_SYSROOT[2] = "sysstat-qt5, -S${libdir}, -S${STAGING_LIBDIR}"
