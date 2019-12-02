SUMMARY = "Qt library for generating printable and exportable reports"
DESCRIPTION = "Qt library for generating printable and exportable reports from code and from XML descriptions"
LICENSE = "(GPLv2 & LGPLv2.1 ) | KDAB-Commercial | KDAB-Commercial-US"
LIC_FILES_CHKSUM = " \
    file://LICENSE.GPL.txt;md5=fa70ea33eec42152e9d40dfb8310b70c \
    file://LICENSE.LGPL.txt;md5=cce5e510cd6a04c95c4b4910d22559fe \
    file://LICENSE.US.txt;md5=affebebb336655a41db530c5594f7dff \
    file://LICENSE.txt;md5=129d14735385614fe7b1d5eee63674a5 \
"

inherit cmake_qt5_extra

DEPENDS += " \
    qtbase \
    kdcharts \
"

SRC_URI = "git://github.com/KDAB/KDReports.git"
SRCREV = "2a7defbef34399838739f87f42c7d36c198b1611"
S = "${WORKDIR}/git"
PV = "1.8.50+git${SRCPV}"
