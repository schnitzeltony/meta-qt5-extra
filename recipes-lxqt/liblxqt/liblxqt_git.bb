SUMMARY = "Core utility library for all LXQt components"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

inherit lxqt cmake-lib

DEPENDS += "libqtxdg kwindowsystem"
SRC_URI += "file://0001-remove-Qt5X11Extras-dependency-it-is-not-required.patch"

SRCREV = "979e0ce7da8fbdcd0b65ea84c8ea80902e69de7d"
PV = "0.9.0+git${SRCPV}"

EXTRA_OECMAKE += "-DCMAKE_INSTALL_DATAROOTDIR=share -DLXQT_ETC_XDG_DIR=${sysconfdir}/xdg"

CMAKE_ALIGN_SYSROOT[1] = "lxqt, -S${includedir}, -S${STAGING_INCDIR}"
CMAKE_ALIGN_SYSROOT[2] = "lxqt, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[3] = "lxqt, -S${datadir}/cmake, -S${STAGING_DATADIR}/cmake"
