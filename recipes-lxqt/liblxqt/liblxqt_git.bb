SUMMARY = "Core utility library for all LXQt components"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt cmake_lib

DEPENDS += "libqtxdg kwindowsystem"
SRC_URI += "file://0001-remove-Qt5X11Extras-dependency-it-is-not-required.patch"

SRCREV = "3cf7384336628043971e6f43df8573563c8a6129"
PV = "0.10.0"

EXTRA_OECMAKE += "-DCMAKE_INSTALL_DATAROOTDIR=share -DLXQT_ETC_XDG_DIR=${sysconfdir}/xdg"

CMAKE_ALIGN_SYSROOT[1] = "lxqt, -S${includedir}, -S${STAGING_INCDIR}"
CMAKE_ALIGN_SYSROOT[2] = "lxqt, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[3] = "lxqt, -S${datadir}/cmake, -S${STAGING_DATADIR}/cmake"
