SUMMARY = "Qt based sequencer"
HOMEPAGE = "https://lmms.io"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit cmake_qt5

DEPENDS += " \
    qtbase \
    jack \
    virtual/fftw \
"

SRC_URI = "git://github.com/LMMS/${BPN}.git"
SRCREV = "cfe5e98bf773abbe6003aa59209967c106965d3c"
S = "${WORKDIR}/git"
PV = "1.1.90+git${SRCPV}"

EXTRA_OECMAKE += " \
    -DWANT_QT5=ON \
"
