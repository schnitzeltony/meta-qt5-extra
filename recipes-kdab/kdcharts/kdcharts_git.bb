SUMMARY = "A Qt tool for creating business and scientific charts"
LICENSE = "GPLv2+ | KDAB-Commercial"
LIC_FILES_CHKSUM = " \
    file://LICENSE.txt;md5=ec5e1ab8584968655cce6fd650160b26 \
    file://LICENSE.GPL.txt;md5=9bea831e8733013a5761386750f57271 \
"

inherit cmake_qt5_extra

DEPENDS += " \
    qtbase \
    qtsvg \
"

SRC_URI = "git://github.com/KDAB/KDChart.git"
SRCREV = "488ae47b2be78b07d196ead7614ab35866c63157"
S = "${WORKDIR}/git"
PV = "2.6.50+git${SRCPV}"

FILES_${PN}-dev += "${datadir}/mkspecs"
