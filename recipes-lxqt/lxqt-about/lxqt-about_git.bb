SUMMARY = "The standalone LXQt "About" dialog"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt

DEPENDS += " \
    liblxqt \
"

SRCREV = "df906c2884cf2389825532e040920be6bd198a0e"
PV = "0.10.0"

FILES_${PN}-dev += "${datadir}/lxqt/lxqt-about/KF5WindowSystemTargets-noconfig.cmake"
