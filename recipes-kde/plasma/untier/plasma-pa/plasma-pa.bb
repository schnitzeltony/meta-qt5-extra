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
    libcanberra \
    \
    kcoreaddons \
    kdeclarative \
    kdoctools \
    kglobalaccel \
    ki18n \
    plasma-framework \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "e58296708b36bb593a1d53da10654ff0"
SRC_URI[sha256sum] = "11fa2025e3326a2c49d54d5291adf56a2395ee4beb9e5c6388e7409917c1a5c8"

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
