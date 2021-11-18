SUMMARY = "The standalone LXQt "About" dialog"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt qt5-translation

DEPENDS += " \
    liblxqt \
"

SRCREV = "7e6376146e4362dbba615ab7dbccde5cca198815"
PV = "1.0.0"
