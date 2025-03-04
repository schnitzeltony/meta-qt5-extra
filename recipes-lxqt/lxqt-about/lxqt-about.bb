SUMMARY = "The standalone LXQt "About" dialog"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt qt5-translation gtk-icon-cache

DEPENDS += " \
    liblxqt \
"

SRCREV = "4921f19de29d91fa2dc9ef1990dd5f2c1a811ef3"
PV = "1.4.0"
