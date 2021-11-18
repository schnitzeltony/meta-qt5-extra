SUMMARY = "The qterminal widget"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4641e94ec96f98fabc56ff9cc48be14b"

inherit lxqt qt5-translation

SRCREV = "cfb8348a535434e9c8acc67d9a7a392607532b85"
PV = "1.0.0"

FILES:${PN} += " \
    ${datadir}/qtermwidget5 \
"
