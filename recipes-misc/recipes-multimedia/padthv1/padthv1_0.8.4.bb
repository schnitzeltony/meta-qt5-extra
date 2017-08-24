SUMMARY = "An old-school polyphonic additive synthesizer"
HOMEPAGE = "http://padthv1.sourceforge.net/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

DEPENDS += " \
    qtbase-native \
    qtbase \
    jack \
    lv2 \
    liblo \
    fftw \
"

inherit qmake5_base autotools-brokensep pkgconfig gtk-icon-cache

# fftwf is neon accelerated -> force SINGLE precision
FFTWSINGLEPATCH = "${@bb.utils.contains('TUNE_FEATURES', 'neon', 'file://0002-Build-against-fftw3f-that-supports-NEON-on-ARM.patch', '', d)}"

SRC_URI = " \
    ${SOURCEFORGE_MIRROR}/project/${BPN}/${BPN}/${PV}/${BPN}-${PV}.tar.gz \
    file://0001-find-native-qt-build-tools-by-configure-options-auto.patch \
    ${FFTWSINGLEPATCH} \
"
SRC_URI[md5sum] = "62716da063ec23ccd4cc625349f6b62c"
SRC_URI[sha256sum] = "198839e774466a2ad42e48f9d56755fd00f9c78c7c53386490ef4090e073dcdc"

EXTRA_OECONF = " \
    --with-qmake=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/qmake \
    --with-moc=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/moc \
    --with-uic=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/uic \
    --with-lupdate=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/lupdate \
    --with-lrelease=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/lrelease \
"

FILES_${PN} += " \
    ${datadir}/appdata \
    ${datadir}/mime \
    ${datadir}/icons \
    ${libdir}/lv2 \
"
