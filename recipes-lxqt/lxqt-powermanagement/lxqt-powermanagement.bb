SUMMARY = "Power management module for LXQt"
LICENSE = "LGPL-2.1-only"
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

SRCREV = "4be64a7f09ad4b96721d1a996085319c375179e4"
PV = "1.4.0"

FILES:${PN} += "${datadir}/icons"
