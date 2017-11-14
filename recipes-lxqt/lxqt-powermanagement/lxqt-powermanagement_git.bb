SUMMARY = "Power management module for LXQt"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt distro_features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "qtsvg liblxqt libqtxdg solid kidletime"

SRCREV = "236f8873f750b149aa213916af5a96a5a86ebe95"
PV = "0.12.0"

FILES_${PN} += "${datadir}/icons"
