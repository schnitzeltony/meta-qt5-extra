SUMMARY = "Tool used to launch programs quickly by typing their names "
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt qt5-translation pkgconfig features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "qtscript libqtxdg lxqt-globalkeys menu-cache muparser"

SRCREV = "da1bd3f4ee258211a5384888ee5924143eb2bcbc"
PV = "1.4.0"
