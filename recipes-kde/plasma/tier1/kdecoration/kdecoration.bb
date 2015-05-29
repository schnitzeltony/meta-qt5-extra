SUMMARY = "Plugin based library to create window decorations"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-plasma cmake-lib

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "97297617f2a3456e31d56fcd9feac889"
SRC_URI[sha256sum] = "56c33a824fc2f5b0e871569843c77867ec94818db29e09755009cbbc63f91da7"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KDecoration2, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KDecoration2, -S${includedir}, -S${STAGING_INCDIR}"
