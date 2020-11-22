SUMMARY = "The standalone LXQt "About" dialog"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt

DEPENDS += " \
    liblxqt \
"

SRCREV = "ea5e708c0e4e7bbd831a6c4d13516b8e9fdf0346"
PV = "0.16.0"
