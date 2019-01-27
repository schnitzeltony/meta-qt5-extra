SUMMARY = "The qterminal widget"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4641e94ec96f98fabc56ff9cc48be14b"

inherit lxqt

SRCREV = "2730ab589e155f14984cf89b7a36110ff7498ded"
PV = "0.14.0"

#EXTRA_OECMAKE += "-DUSE_QT5=ON -DBUILD_DESIGNER_PLUGIN=OFF"

FILES_${PN} += " \
    ${datadir}/qtermwidget5 \
"
