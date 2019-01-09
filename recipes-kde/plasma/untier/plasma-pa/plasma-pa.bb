SUMMARY = "Plasma applet for audio volume management using PulseAudio"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-plasma gettext

DEPENDS += " \
    glib-2.0 \
    pulseaudio \
    libcanberra \
    \
    kcoreaddons \
    kcoreaddons-native \
    kconfig-native \
    kpackage-native \
    kdeclarative \
    kdoctools \
    kdoctools-native \
    kglobalaccel \
    ki18n \
    plasma-framework \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "ab16b6976bf83f4a4c1825456d23f356"
SRC_URI[sha256sum] = "0f4735d97950921517d96f3bd24753c6e6416384e7a010ed77317852cfc3e47c"

FILES_SOLIBSDEV = ""

RDEPENDS_${PN} = "pulseaudio-server"

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
