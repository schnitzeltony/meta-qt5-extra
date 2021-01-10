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

SRCREV = "33a3da98d6466418cb3284892bc572e6edf321f1"
PV = "0.16.0"

FILES_${PN} += "${datadir}/icons"
