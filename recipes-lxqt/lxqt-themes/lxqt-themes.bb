SUMMARY = "Themes, graphics and icons for LXQt"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt pkgconfig gtk-icon-cache

SRCREV = "d27f9b00c14bcd0eb66d0fcb114e03f5d4cffc59"
PV = "0.17.0"

FILES_${PN} += " \
    ${datadir}/lxqt \
    ${datadir}/icons \
"

