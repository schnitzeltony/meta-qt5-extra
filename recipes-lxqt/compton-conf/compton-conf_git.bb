SUMMARY = "GUI configuration tool for compton X composite manager"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt pkgconfig

DEPENDS += "libconfig"

SRCREV = "af5d2fcd138180e5ff64ee0dcd70311dde5faf38"
PV = "0.14.1"

FILES_${PN} += "${datadir}/${BPN}/compton.conf.example"

RDEPENDS_${PN} += "compton"
