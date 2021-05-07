SUMMARY = "Daemon used to register global keyboard shortcuts"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt qt5-translation features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "liblxqt"

SRCREV = "b6958f7488f26f31013cdf78dfa5805bf0644446"
PV = "0.17.0"

FILES_${PN} += "${datadir}/lxqt"
