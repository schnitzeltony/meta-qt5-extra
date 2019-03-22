SUMMARY = "The qterminal widget"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4641e94ec96f98fabc56ff9cc48be14b"

inherit lxqt

SRCREV = "456e3568092d2d111c61e414cb20743f24c9388c"
PV = "0.14.1"

#EXTRA_OECMAKE += "-DUSE_QT5=ON -DBUILD_DESIGNER_PLUGIN=OFF"

FILES_${PN} += " \
    ${datadir}/qtermwidget5 \
"
