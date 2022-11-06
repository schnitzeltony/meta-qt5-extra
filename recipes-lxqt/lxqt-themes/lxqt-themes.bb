SUMMARY = "Themes, graphics and icons for LXQt"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt pkgconfig gtk-icon-cache

SRCREV = "e8d0c1f34a0656c7502e8280439652a06639f63d"
PV = "1.2.0"

FILES:${PN} += " \
    ${datadir}/lxqt \
    ${datadir}/icons \
"

