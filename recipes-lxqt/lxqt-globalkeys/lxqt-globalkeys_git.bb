SUMMARY = "Daemon used to register global keyboard shortcuts"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

inherit lxqt cmake-lib distro_features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "liblxqt"

SRCREV = "4504880ff4c960a7cf1e971128c415390109feed"
PV = "0.9.0"

CMAKE_ALIGN_SYSROOT[1] = "lxqt-globalkeys, -S${includedir}, -S${STAGING_INCDIR}"
CMAKE_ALIGN_SYSROOT[2] = "lxqt-globalkeys, -S${libdir}, -S${STAGING_LIBDIR}"
CMAKE_ALIGN_SYSROOT[3] = "lxqt-globalkeys-ui, -S${includedir}, -S${STAGING_INCDIR}"
CMAKE_ALIGN_SYSROOT[4] = "lxqt-globalkeys-ui, -S${libdir}, -S${STAGING_LIBDIR}"
