SUMMARY = "Daemon used to register global keyboard shortcuts"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt qt5-translation features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "liblxqt"

SRCREV = "1ad11b8445398f479525a685c0167567590aa850"
PV = "1.0.0"

FILES:${PN} += "${datadir}/lxqt"
