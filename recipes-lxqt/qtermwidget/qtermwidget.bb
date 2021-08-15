SUMMARY = "The qterminal widget"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4641e94ec96f98fabc56ff9cc48be14b"

inherit lxqt qt5-translation

SRCREV = "215fd43b0c1d2f013d9207a13f5d4a627fa12565"
PV = "0.17.0"

FILES:${PN} += " \
    ${datadir}/qtermwidget5 \
"
