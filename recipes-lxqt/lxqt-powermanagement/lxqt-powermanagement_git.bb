SUMMARY = "Power management module for LXQt"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6324954af145f280672cc576862fda80"

inherit lxqt distro_features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "qtsvg liblxqt libqtxdg solid"

SRCREV = "a49f1c98972b817a5f3e6489ffe00dd6afe010ec"
PV = "0.9.0+git${SRCPV}"

FILES_${PN} += "${datadir}/icons"
