SUMMARY = "Qt library for generating printable and exportable reports"
DESCRIPTION = "Qt library for generating printable and exportable reports from code and from XML descriptions"
LICENSE = "BSD-3-Clause & MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/MIT.txt;md5=7dda4e90ded66ab88b86f76169f28663 \
"

inherit cmake_qt5_extra

DEPENDS += " \
    qtbase \
    kdcharts \
"

SRC_URI = "git://github.com/KDAB/KDReports.git;branch=master;protocol=https"
SRCREV = "a5095bd266b5d4697978e1a3042481edd72c2c3f"
S = "${WORKDIR}/git"
PV = "2.2.0"

do_install:append() {
    # these have gone wild / qmake was always pain
    rm -r ${D}/usr/mkspecs
}

