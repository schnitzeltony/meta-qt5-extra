SUMMARY = "The qterminal widget"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4641e94ec96f98fabc56ff9cc48be14b"

inherit lxqt qt5-translation

SRCREV = "a4be489f482f8c6a580be29ef0afb6ed159a5d35"
PV = "1.1.0"

FILES:${PN} += "${datadir}/qtermwidget5"
