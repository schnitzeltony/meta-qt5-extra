SUMMARY = "Daemon used to register global keyboard shortcuts"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "liblxqt"

SRCREV = "d3cb8582647b8451954307d11716676247607bbd"
PV = "0.15.0"

FILES_${PN} += "${datadir}/lxqt"
