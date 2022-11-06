SUMMARY = "The standalone LXQt "About" dialog"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt qt5-translation gtk-icon-cache

DEPENDS += " \
    liblxqt \
"

SRCREV = "2d2e2cb63457da83c438eb356f4853122d064dfd"
PV = "1.2.0"
