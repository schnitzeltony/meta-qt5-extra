SUMMARY = "The qterminal widget"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4641e94ec96f98fabc56ff9cc48be14b"

inherit lxqt qt5-translation

SRCREV = "58981da1625810aa0a3dcc605bacba73f580ccdd"
PV = "1.4.0"

FILES:${PN} += "${datadir}/qtermwidget5"
