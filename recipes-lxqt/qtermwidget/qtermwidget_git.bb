SUMMARY = "The qterminal widget"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4641e94ec96f98fabc56ff9cc48be14b"

inherit lxqt

SRCREV = "1e00757da69ef4dd926b31beb5bb7c73ab255782"
PV = "0.8.0"

#EXTRA_OECMAKE += "-DUSE_QT5=ON -DBUILD_DESIGNER_PLUGIN=OFF"

FILES_${PN} += " \
    ${datadir}/qtermwidget5 \
"
