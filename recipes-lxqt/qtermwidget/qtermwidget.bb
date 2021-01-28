SUMMARY = "The qterminal widget"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4641e94ec96f98fabc56ff9cc48be14b"

inherit lxqt qt5-translation

SRCREV = "6535ddf675c444b679a446ec14aa93df98e5fc98"
PV = "0.16.1"

FILES_${PN} += " \
    ${datadir}/qtermwidget5 \
"
