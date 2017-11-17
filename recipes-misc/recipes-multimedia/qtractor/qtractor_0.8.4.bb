SUMMARY = "An Audio/MIDI multi-track sequencer"
HOMEPAGE = "http://qtractor.sourceforge.net/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

DEPENDS += " \
    qttools-native \
    qtbase \
    qtx11extras \
    jack \
    lilv \
    libmad \
    rubberband \
    dssi \
    suil \
"

inherit qmake5_base autotools-brokensep pkgconfig gtk-icon-cache

SRC_URI = " \
    git://github.com/rncbc/qtractor.git;branch=neonx \
    file://0001-find-native-qt-build-tools-by-configure-options-auto.patch \
    file://0002-do-nor-try-run-for-float-sse-detection.patch \
    file://0003-do-nor-try-run-for-suil-libs-detection.patch \
    file://0004-Add-ARM-NEON-acceleration-for-time-stretch-not-yet-t.patch \
    file://0005-Add-qtractorPluginListDocument-to-save-load-plugin-l.patch \
    file://0006-Add-MIDI-import-options-to-create-ready-to-play-sess.patch \
    file://0007-Hold-defer-JACK-timebase-reset-on-main-time-scale-up.patch \
"
SRCREV = "9e4fe9fecbd8d8161c40b77924e834f139597a83"
PV = "0.8.4+git${SRCPV}"
S = "${WORKDIR}/git"

EXTRA_OECONF = " \
    --with-qmake=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/qmake \
    --with-moc=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/moc \
    --with-uic=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/uic \
    --with-lupdate=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/lupdate \
    --with-lrelease=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/lrelease \
"

FILES_${PN} += " \
    ${datadir}/mime \
    ${datadir}/metainfo \
"
