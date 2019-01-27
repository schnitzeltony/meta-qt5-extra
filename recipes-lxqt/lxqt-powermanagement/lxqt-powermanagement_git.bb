SUMMARY = "Power management module for LXQt"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt distro_features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "qtsvg liblxqt libqtxdg solid kidletime"

SRCREV = "959f0691d69f7101f6e9c168a58fa918e41732a9"
PV = "0.14.0"

FILES_${PN} += "${datadir}/icons"
