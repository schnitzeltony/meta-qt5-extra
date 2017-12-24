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
    file://qmidiarp-alsa.desktop \
    file://qmidiarp-jack.desktop \
"

SRCREV = "bf9300363578eee44ce2e1e42e938ce338425937"
S = "${WORKDIR}/git"

EXTRA_OECONF = " \
    --enable-translations \
    --with-moc=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/moc \
    --with-lupdate=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/lupdate \
    --with-lrelease=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/lrelease \
"

do_install_append() {
    # replace default and split alsa
    rm -f ${D}/${datadir}/applications/qmidiarp.desktop
    install -m 644 ${WORKDIR}/qmidiarp-alsa.desktop ${D}/${datadir}/applications/
    install -m 644 ${WORKDIR}/qmidiarp-jack.desktop ${D}/${datadir}/applications/
}

FILES_${PN} += " \
    ${datadir}/metainfo \
    ${datadir}/qmidiarp/examples \
    ${datadir}/icons \
    ${libdir}/lv2 \
"
