SUMMARY = "Themes, graphics and icons for LXQt"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt pkgconfig gtk-icon-cache

SRCREV = "601b21a9b2dd8707173bb5a89bc8d9e2b195b386"
PV = "0.13.0"

FILES_${PN} += " \
    ${datadir}/lxqt \
    ${datadir}/icons \
"

