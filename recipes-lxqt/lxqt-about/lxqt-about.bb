SUMMARY = "The standalone LXQt "About" dialog"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt qt5-translation gtk-icon-cache

DEPENDS += " \
    liblxqt \
"

SRCREV = "357feaf6a55f479e1c0321bd1af8dcb1c0841c11"
PV = "1.1.0"
