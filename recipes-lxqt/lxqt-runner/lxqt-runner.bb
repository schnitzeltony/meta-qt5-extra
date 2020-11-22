SUMMARY = "Tool used to launch programs quickly by typing their names "
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt pkgconfig features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "qtscript libqtxdg lxqt-globalkeys menu-cache muparser"

SRCREV = "3abfd5f2fc21e781ee5dc44fac50bcd6f5c2827e"
PV = "0.16.0"
