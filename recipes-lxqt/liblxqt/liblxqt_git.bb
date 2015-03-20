SUMMARY = "Core utility library for all LXQt components"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

inherit lxqt cmake-lib

DEPENDS += "libqtxdg kwindowsystem"

SRCREV = "64d1e6c1076aea2783138e9d5ce4bb30b58c77b4"
PV = "0.9.0"

EXTRA_OECMAKE += "-DCMAKE_INSTALL_DATAROOTDIR=share -DLXQT_ETC_XDG_DIR=${sysconfdir}/xdg"

CMAKE_ALIGN_SYSROOT[1] = "lxqt, -S${includedir}, -S${STAGING_INCDIR}"
CMAKE_ALIGN_SYSROOT[2] = "lxqt, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[3] = "lxqt, -S${datadir}/cmake, -S${STAGING_DATADIR}/cmake"
