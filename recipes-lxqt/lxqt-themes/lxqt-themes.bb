SUMMARY = "Themes, graphics and icons for LXQt"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt pkgconfig gtk-icon-cache

SRCREV = "f33eee46eb69a87859a373cf03ed7e6afc38d6a2"
PV = "1.3.0"

FILES:${PN} += " \
    ${datadir}/lxqt \
    ${datadir}/icons \
"

