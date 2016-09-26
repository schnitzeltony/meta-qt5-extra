SUMMARY = "Core utility library for all LXQt components"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt cmake_lib distro_features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "libqtxdg kwindowsystem libxscrnsaver"

SRCREV = "24c1c943b87ffc4492ca0db1747691534ce3e77e"
PV = "0.11.0"

EXTRA_OECMAKE += " \
    -DCMAKE_INSTALL_DATAROOTDIR=share \
    -DLXQT_ETC_XDG_DIR=${sysconfdir}/xdg \
"

CMAKE_ALIGN_SYSROOT[1] = "lxqt, -S${datadir}/cmake, -S${STAGING_DATADIR}/cmake"
