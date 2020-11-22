SUMMARY = "Themes, graphics and icons for LXQt"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt pkgconfig gtk-icon-cache

SRCREV = "1a294eabe408fcf1692ef10dec114e5f53dfc74b"
PV = "0.16.0"

FILES_${PN} += " \
    ${datadir}/lxqt \
    ${datadir}/icons \
"

