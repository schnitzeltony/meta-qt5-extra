SUMMARY = "The qterminal widget"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4641e94ec96f98fabc56ff9cc48be14b"

inherit lxqt

SRCREV = "ccd6b7d4f52337df4a588dc4f88ddc93d896741a"
PV = "0.15.0"

FILES_${PN} += " \
    ${datadir}/qtermwidget5 \
"
