SUMMARY = "A Qt tool for creating business and scientific charts"
LICENSE = "GPLv2+ | KDAB-Commercial"
LIC_FILES_CHKSUM = " \
    file://LICENSE.txt;md5=d5e1956ab398a4ae39e2470a9abd4889 \
    file://LICENSE.GPL.txt;md5=6af452a21ffa624c438c2cde4423a893 \
"

inherit cmake_qt5_extra

DEPENDS += " \
    qtbase \
    qtsvg \
"

do_install_append() {
    # these have gone wild / qmake was always pain
    rm -r ${D}/usr/mkspecs
}

SRC_URI = "git://github.com/KDAB/KDChart.git"
SRCREV = "95547e8a2f6c362db1dd071a2df00b0e75e05da0"
S = "${WORKDIR}/git"
PV = "2.7.2"

FILES_${PN}-dev += "${datadir}/mkspecs"
