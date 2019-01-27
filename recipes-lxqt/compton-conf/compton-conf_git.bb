SUMMARY = "GUI configuration tool for compton X composite manager"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt pkgconfig

DEPENDS += "libconfig"

SRCREV = "e307401e23bf9798e40a8b618b220d5bb58943e5"
PV = "0.14.0"

FILES_${PN} += "${datadir}/${BPN}/compton.conf.example"

RDEPENDS_${PN} += "compton"
