SUMMARY = "Themes, graphics and icons for LXQt"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt pkgconfig gtk-icon-cache

SRCREV = "658996f00c68d5ebc79451aee67ac891356f5aed"
PV = "1.0.0"

FILES:${PN} += " \
    ${datadir}/lxqt \
    ${datadir}/icons \
"

