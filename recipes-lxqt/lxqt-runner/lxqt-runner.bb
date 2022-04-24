SUMMARY = "Tool used to launch programs quickly by typing their names "
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt qt5-translation pkgconfig features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "qtscript libqtxdg lxqt-globalkeys menu-cache muparser"

SRCREV = "6a96712ced7fa61e6d95e3466ae38cf5a9b43fb3"
PV = "1.1.0"
