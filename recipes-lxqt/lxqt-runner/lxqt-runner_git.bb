SUMMARY = "Tool used to launch programs quickly by typing their names "
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

inherit lxqt pkgconfig

DEPENDS += "qtscript libqtxdg lxqt-globalkeys menu-cache"

SRCREV = "de6de66013e15f149526f6eee856aeef316a3198"
PV = "0.9.0"

# REVISIT: These are poluted by host paths
FILES_${PN}-dev += "${datadir}/lxqt/lxqt-runner/*.cmake"
