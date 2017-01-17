SUMMARY = "The qterminal widget"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4641e94ec96f98fabc56ff9cc48be14b"

inherit lxqt cmake_lib

SRCREV = "2d5717931128ea28af9daaea4c3464d3ea4d8315"
PV = "0.7.1"

#EXTRA_OECMAKE += "-DUSE_QT5=ON -DBUILD_DESIGNER_PLUGIN=OFF"

FILES_${PN} += " \
    ${datadir}/qtermwidget5 \
"

CMAKE_ALIGN_SYSROOT[1] = "qtermwidget5, -S${includedir}, -S${STAGING_INCDIR}"
