SUMMARY = "Core utility library for all LXQt components"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

inherit lxqt cmake-lib

DEPENDS += "libqtxdg kwindowsystem"

SRCREV = "70bab6483fbe1f4aff1625b7a6afceaf5216cb80"
PV = "0.8.0+git${SRCPV}"

EXTRA_OECMAKE += "-DCMAKE_INSTALL_DATAROOTDIR=share -DLXQT_ETC_XDG_DIR=${sysconfdir}/xdg"

CMAKE_HIDE_ERROR[1] = "lxqt, -S${includedir}, -S${STAGING_INCDIR}"
CMAKE_HIDE_ERROR[2] = "lxqt, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[3] = "lxqt, -S${datadir}/cmake, -S${STAGING_DATADIR}/cmake"
