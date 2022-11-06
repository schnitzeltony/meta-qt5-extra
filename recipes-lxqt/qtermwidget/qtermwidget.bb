SUMMARY = "The qterminal widget"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4641e94ec96f98fabc56ff9cc48be14b"

inherit lxqt qt5-translation

SRCREV = "c72802ed007728d1507d3aea742aa138998cf01c"
PV = "1.2.0"

FILES:${PN} += "${datadir}/qtermwidget5"
