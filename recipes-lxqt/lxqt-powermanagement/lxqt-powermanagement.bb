SUMMARY = "Power management module for LXQt"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "qtsvg liblxqt libqtxdg solid kidletime"

SRCREV = "522c571ff8bbd9cf4ea1bc67f0e5e8ace51c8609"
PV = "0.15.0"

FILES_${PN} += "${datadir}/icons"
