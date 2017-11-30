SUMMARY = "A Linux MIDI Arpeggiator, Step Sequencer and LFO"
HOMEPAGE = "http://qmidiarp.sourceforge.net"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=cbbd794e2a0a289b9dfcc9f513d1996e"

DEPENDS += " \
    qtbase-native \
    qtbase \
    jack \
    lv2 \
    liblo \
"

inherit qmake5_base autotools-brokensep pkgconfig gtk-icon-cache qt5-translation

SRC_URI = " \
    git://github.com/emuse/qmidiarp.git \
    file://0001-remove-code-to-find-qtwidget-headers-it-finds-host-s.patch \
    file://0002-find-native-qt-build-tools-by-configure-options-auto.patch \
"

SRCREV = "05a1462569c1fb771852ca51bb8e5c8192b13e9d"
S = "${WORKDIR}/git"
PV = "0.6.4+git${SRCPV}"

EXTRA_OECONF = " \
    --enable-translations \
    --with-moc=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/moc \
    --with-lupdate=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/lupdate \
    --with-lrelease=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/lrelease \
"

FILES_${PN} += " \
    ${datadir}/appdata \
    ${datadir}/qmidiarp/examples \
    ${datadir}/icons \
    ${libdir}/lv2 \
"
