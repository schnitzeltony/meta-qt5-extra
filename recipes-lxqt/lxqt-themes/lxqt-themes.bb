SUMMARY = "Themes, graphics and icons for LXQt"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt pkgconfig gtk-icon-cache

SRCREV = "b00f6a8593af128846b9a4fcf7404c94f5887a52"
PV = "1.1.0"

FILES:${PN} += " \
    ${datadir}/lxqt \
    ${datadir}/icons \
"

