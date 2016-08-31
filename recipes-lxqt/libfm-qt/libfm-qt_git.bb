SUMMARY = "Qt port of libfm - a library to build desktop file managers"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

REQUIRED_DISTRO_FEATURES = "x11"

inherit lxqt pkgconfig distro_features_check

DEPENDS += "qtx11extras glib-2.0 libfm menu-cache"

SRCREV = "6f4782e12b9a1789a6d49e51e1f98e04ede2e896"
PV = "0.11.0"

RRECOMMENDS_${PN} = "gvfs gvfsd-trash eject"
