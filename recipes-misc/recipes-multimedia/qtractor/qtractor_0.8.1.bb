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
    ${SOURCEFORGE_MIRROR}/project/${BPN}/${BPN}/${PV}/${BPN}-${PV}.tar.gz \
    file://0001-find-native-qt-build-tools-by-configure-options-auto.patch \
    file://0002-do-nor-try-run-for-float-sse-detection.patch \
    file://0003-do-nor-try-run-for-suil-libs-detection.patch \
    file://0004-Add-ARM-NEON-intrinsics.patch \
"
SRC_URI[md5sum] = "89949777599c68208f120a6af93f8a12"
SRC_URI[sha256sum] = "baf14db40d0ea5b6356482b2c5b9e53aeb5e58177f820b408a4cb9e94b4e7adf"

EXTRA_OECONF = " \
    --with-qmake=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/qmake \
    --with-moc=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/moc \
    --with-uic=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/uic \
    --with-lupdate=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/lupdate \
    --with-lrelease=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/lrelease \
"

FILES_${PN} += " \
  ${datadir}/mime \
  ${datadir}/appdata \
"
