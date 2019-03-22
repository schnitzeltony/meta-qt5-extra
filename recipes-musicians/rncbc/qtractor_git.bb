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

inherit qmake5_base autotools-brokensep pkgconfig gtk-icon-cache mime qt5-translation

SRC_URI = " \
    git://github.com/rncbc//qtractor.git;branch=midiimportx \
    file://0001-no-Qt4-find-native-qt-build-tools-by-configure-options-auto.patch \
    \
    file://0001-do-nor-try-run-for-float-sse-detection.patch \
    file://0002-do-nor-try-run-for-suil-libs-detection.patch \
    file://0003-Add-ARM-NEON-acceleration-for-time-stretch-not-yet-t.patch \
    \
    file://Qtractor.conf \
"
SRCREV = "ebea558d470b6fc917843abcd46de117825f5469"
PV = "0.9.5+git${SRCPV}"
S = "${WORKDIR}/git"

EXTRA_OECONF = " \
    --with-qmake=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/qmake \
    --with-moc=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/moc \
    --with-uic=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/uic \
    --with-lupdate=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/lupdate \
    --with-lrelease=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/lrelease \
"

do_install_append() {
    install -d ${D}/${sysconfdir}/skel/.config/rncbc.org
    install -m 0644 ${WORKDIR}/Qtractor.conf ${D}/${sysconfdir}/skel/.config/rncbc.org/
}

PACKAGES =+ "${PN}-defconfig"

FILES_${PN} += " \
    ${datadir}/mime \
    ${datadir}/metainfo \
"

FILES_${PN}-defconfig = " \
    ${sysconfdir}/skel/.config/rncbc.org \
"

RDEPENDS_${PN}-defconfig = "${PN} fluidsynth-dssi"
