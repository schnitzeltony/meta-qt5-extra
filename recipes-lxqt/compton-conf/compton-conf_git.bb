SUMMARY = "GUI configuration tool for compton X composite manager"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt pkgconfig

DEPENDS += "libconfig"

SRCREV = "e71ee4c9a6e3a3b579543bb0e6d969b585ff3209"
PV = "0.2.0"

EXTRA_OECMAKE += " \
    -DPULL_TRANSLATIONS=Off \
    -DCLEAN_TRANSLATIONS=Off \
"

FILES_${PN} += "${datadir}/${BPN}/compton.conf.example"

RDEPENDS_${PN} += "compton"
