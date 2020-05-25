SUMMARY = "Themes, graphics and icons for LXQt"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt pkgconfig gtk-icon-cache

SRCREV = "3b9f1de06ce397ce8c75ea1ac334fab61e4bde14"
PV = "0.15.0"

FILES_${PN} += " \
    ${datadir}/lxqt \
    ${datadir}/icons \
"

