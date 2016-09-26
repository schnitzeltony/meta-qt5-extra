SUMMARY = "Qt port of libfm - a library to build desktop file managers"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

REQUIRED_DISTRO_FEATURES = "x11"

inherit lxqt pkgconfig distro_features_check

DEPENDS += "qtx11extras glib-2.0 libfm menu-cache libxcb liblxqt"

SRC_URI += "file://0001-src-CMakeLists.txt-hard-code-xcb-link-target.patch"
SRCREV = "ff6beead85f37830c08a59592883b649ecda0733"
PV = "0.11.1"

RRECOMMENDS_${PN} = "gvfs gvfsd-trash eject"
