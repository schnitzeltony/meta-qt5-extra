SUMMARY = "Daemon used to register global keyboard shortcuts"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt qt5-translation features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "liblxqt"

SRCREV = "1dce57dbd7b6d45093051561211519e24a03ec42"
PV = "1.1.0"

FILES:${PN} += "${datadir}/lxqt"
