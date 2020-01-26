SUMMARY = "Daemon used to register global keyboard shortcuts"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "liblxqt"

SRCREV = "33637a417a5464fd5353d49eff83b786942e1b00"
PV = "0.14.3+git${SRCPV}"

FILES_${PN} += "${datadir}/lxqt"
