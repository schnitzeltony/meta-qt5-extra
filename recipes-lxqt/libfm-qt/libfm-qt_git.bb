SUMMARY = "Qt port of libfm - a library to build desktop file managers"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

REQUIRED_DISTRO_FEATURES = "x11"

inherit lxqt cmake-lib pkgconfig distro_features_check

DEPENDS += "qtx11extras glib-2.0 libfm menu-cache"

SRCREV = "a197e6d919d28b83dd5c97984d424ece5c2d9b69"
PV = "0.10.0+git${SRCPV}"

CMAKE_ALIGN_SYSROOT[1] = "fm-qt, -S${includedir}, -S${STAGING_INCDIR}"
CMAKE_ALIGN_SYSROOT[2] = "fm-qt, -S${libdir}, -S${STAGING_LIBDIR}"

RRECOMMENDS_${PN} = "gvfs gvfsd-trash eject"
