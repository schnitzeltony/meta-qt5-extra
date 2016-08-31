SUMMARY = "Daemon used to register global keyboard shortcuts"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt cmake_lib distro_features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "liblxqt"

SRCREV = "2182537ae53f1abec533504bdac646e10c7228c2"
PV = "0.10.0"

CMAKE_ALIGN_SYSROOT[1] = "lxqt-globalkeys, -S${includedir}, -S${STAGING_INCDIR}"
CMAKE_ALIGN_SYSROOT[2] = "lxqt-globalkeys, -S${libdir}, -S${STAGING_LIBDIR}"
CMAKE_ALIGN_SYSROOT[3] = "lxqt-globalkeys-ui, -S${includedir}, -S${STAGING_INCDIR}"
CMAKE_ALIGN_SYSROOT[4] = "lxqt-globalkeys-ui, -S${libdir}, -S${STAGING_LIBDIR}"
