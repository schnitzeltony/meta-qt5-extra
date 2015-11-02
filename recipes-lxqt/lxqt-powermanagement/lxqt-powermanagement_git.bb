SUMMARY = "Power management module for LXQt"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt distro_features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "qtsvg liblxqt libqtxdg solid"

SRCREV = "1d243e51f0e9d653a069247bbb8fd56623d89fda"
PV = "0.10.0"

FILES_${PN} += "${datadir}/icons"
