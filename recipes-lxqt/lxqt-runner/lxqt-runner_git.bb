SUMMARY = "Tool used to launch programs quickly by typing their names "
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt pkgconfig distro_features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "qtscript libqtxdg lxqt-globalkeys menu-cache muparser"

SRCREV = "3e5b466275163883b7bf3f2ec10f33b709fa8600"
PV = "0.11.1"

# REVISIT: These are poluted by host paths
FILES_${PN}-dev += "${datadir}/lxqt/lxqt-runner/*.cmake"
