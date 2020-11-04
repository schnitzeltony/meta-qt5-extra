SUMMARY = "The qterminal widget"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4641e94ec96f98fabc56ff9cc48be14b"

inherit lxqt

SRCREV = "63b146352fbaf3b92f45b44c1e37249724fc129d"
PV = "0.16.0"

FILES_${PN} += " \
    ${datadir}/qtermwidget5 \
"
