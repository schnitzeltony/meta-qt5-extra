SUMMARY = "GUI configuration tool for compton X composite manager"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt pkgconfig

DEPENDS += "libconfig"

SRCREV = "6696ddbf58c50811a9c6005c78d4d63792ee5d20"
PV = "0.15.0"

FILES_${PN} += "${datadir}/${BPN}/compton.conf.example"

RDEPENDS_${PN} += "compton"
