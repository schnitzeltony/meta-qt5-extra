SUMMARY = "Power management module for LXQt"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt distro_features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "qtsvg liblxqt libqtxdg solid kidletime"

SRCREV = "af56a1d21d074d7bd5eebdfd56b076d3c1815f44"
PV = "0.13.0"

FILES_${PN} += "${datadir}/icons"
