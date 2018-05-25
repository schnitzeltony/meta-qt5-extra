SUMMARY = "GUI configuration tool for compton X composite manager"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt pkgconfig

DEPENDS += "libconfig"

SRCREV = "c6a6dd01d53fcb5c778e3d2d76371f1e034ab676"
PV = "0.4.0"

FILES_${PN} += "${datadir}/${BPN}/compton.conf.example"

RDEPENDS_${PN} += "compton"
