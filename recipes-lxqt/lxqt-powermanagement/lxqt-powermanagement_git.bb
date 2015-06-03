SUMMARY = "Power management module for LXQt"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6324954af145f280672cc576862fda80"

inherit lxqt distro_features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "qtsvg liblxqt libqtxdg"

SRCREV = "4bc9f66d12afb4bab72867c64769697aab74bfa4"
PV = "0.9.0"

FILES_${PN} += "${datadir}/icons"
