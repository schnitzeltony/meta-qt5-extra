SUMMARY = "Plasma applet for audio volume management using PulseAudio"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-plasma

DEPENDS += " \
    glib-2.0 \
    pulseaudio \
    \
    kcoreaddons \
    kdeclarative \
    kdoctools \
    kglobalaccel \
    ki18n \
    plasma-framework \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "e44ddb3d397b070d3dfb7ede0c2f2ea8"
SRC_URI[sha256sum] = "838a2a9ca9e1dd4c0536c8b3794f742519a3ccd3a1ec94275b6a32b0551fc2b4"

FILES_SOLIBSDEV = ""

FILES_${PN} += " \
    ${datadir}/kpackage \
    ${datadir}/kconf_update \
    ${datadir}/kde4 \
    ${datadir}/plasma \
    ${datadir}/kservices5 \
    ${libdir}/lib*Private.so \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/*/.debug \
    ${OE_QMAKE_PATH_QML}/*/*/*/*/*/.debug \
"
