SUMMARY = "Themes, graphics and icons for LXQt"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt pkgconfig gtk-icon-cache

SRCREV = "810e244bb55a0d5a27567ef9482413b48ea39a7d"
PV = "0.14.0"

FILES_${PN} += " \
    ${datadir}/lxqt \
    ${datadir}/icons \
"

