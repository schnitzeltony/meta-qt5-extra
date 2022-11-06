SUMMARY = "A Qt tool for creating business and scientific charts"
LICENSE = "BSD-3-Clause & MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=f225922a2c12dfa5218fb70c49db3ea6 \
    file://LICENSES/MIT.txt;md5=7dda4e90ded66ab88b86f76169f28663 \
"

inherit cmake_qt5_extra

DEPENDS += " \
    qtbase \
    qtsvg \
"

do_install:append() {
    # these have gone wild / qmake was always pain
    rm -r ${D}/usr/mkspecs
}

SRC_URI = "git://github.com/KDAB/KDChart.git;branch=master;protocol=https"
SRCREV = "aa9de13376a5e9f4c8802091776584614db8677e"
S = "${WORKDIR}/git"
PV = "3.0.0"

FILES:${PN}-dev += "${datadir}/mkspecs"
