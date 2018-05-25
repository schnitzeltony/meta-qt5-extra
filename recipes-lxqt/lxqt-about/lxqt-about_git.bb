SUMMARY = "The standalone LXQt "About" dialog"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt

DEPENDS += " \
    liblxqt \
"

SRCREV = "f085a04cbf523a961ac6110a5c5ab7c669b53652"
PV = "0.13.0"
