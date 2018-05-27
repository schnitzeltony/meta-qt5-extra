SUMMARY = "Tool used to launch programs quickly by typing their names "
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt pkgconfig distro_features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "qtscript libqtxdg lxqt-globalkeys menu-cache muparser"

SRCREV = "aa5f0b43aafe42c352da25a26fc6d95bb3f6de38"
PV = "0.13.0"

# REVISIT: These are poluted by host paths
FILES_${PN}-dev += "${datadir}/lxqt/lxqt-runner/*.cmake"
