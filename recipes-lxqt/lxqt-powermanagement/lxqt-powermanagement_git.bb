SUMMARY = "Power management module for LXQt"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt distro_features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "qtsvg liblxqt libqtxdg solid kidletime"

SRCREV = "d6deabcee9c03d700e886cb6f8f91318b72f9587"
PV = "0.11.1"

FILES_${PN} += "${datadir}/icons"
