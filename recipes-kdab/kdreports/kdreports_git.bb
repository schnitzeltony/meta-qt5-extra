SUMMARY = "Qt library for generating printable and exportable reports"
DESCRIPTION = "Qt library for generating printable and exportable reports from code and from XML descriptions"
LICENSE = "(LGPL-2.1 | LGPL-3.0) & (GPL-2.0 | GPL-3.0 ) | KDAB-Commercial"
LIC_FILES_CHKSUM = " \
    file://LICENSE.txt;md5=d988404a6396edf41e7f8cbb2db3c185 \
"

inherit cmake_qt5_extra

DEPENDS += " \
    qtbase \
    kdcharts \
"

SRC_URI = "git://github.com/KDAB/KDReports.git"
SRCREV = "47728293e7842140d36a7861cf4316f2c1cbd795"
S = "${WORKDIR}/git"
PV = "1.9.0"

do_install:append() {
    # these have gone wild / qmake was always pain
    rm -r ${D}/usr/mkspecs
}

