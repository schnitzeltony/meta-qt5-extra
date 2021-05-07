SUMMARY = "Power management module for LXQt"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt qt5-translation features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += " \
    qtsvg \
    solid \
    kidletime \
    liblxqt \
    libqtxdg \
    lxqt-globalkeys \
"

SRCREV = "abdc5eead3502163115235d18a6d42c6d08b1ef2"
PV = "0.17.1"

FILES_${PN} += "${datadir}/icons"
