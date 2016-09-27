SUMMARY = "The qterminal widget"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4641e94ec96f98fabc56ff9cc48be14b"

inherit lxqt cmake_lib

SRCREV = "97d96dfb889fb1d6f1a6c6fc857defd6a8192342"
PV = "0.7.0"

#EXTRA_OECMAKE += "-DUSE_QT5=ON -DBUILD_DESIGNER_PLUGIN=OFF"

FILES_${PN} += " \
    ${datadir}/qtermwidget5 \
"

CMAKE_ALIGN_SYSROOT[1] = "qtermwidget5, -S${includedir}, -S${STAGING_INCDIR}"
