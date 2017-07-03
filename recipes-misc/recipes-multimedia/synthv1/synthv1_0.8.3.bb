SUMMARY = "An old-school all-digital 4-oscillator subtractive polyphonic synthesizer"
HOMEPAGE = "http://synthv1.sourceforge.net/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

DEPENDS += " \
    qtbase-native \
    qtbase \
    jack \
    lv2 \
    liblo \
"

inherit qmake5_base autotools-brokensep pkgconfig gtk-icon-cache

SRC_URI = " \
    ${SOURCEFORGE_MIRROR}/project/${BPN}/${BPN}/${PV}/${BPN}-${PV}.tar.gz \
    file://0001-find-native-qt-build-tools-by-configure-options-auto.patch \
"
SRC_URI[md5sum] = "d775f714f84e4e8daff0939748e49e14"
SRC_URI[sha256sum] = "8f6199a4e30fcf7282b07b64cd2461757b34006c048e55820b008741ba3c10fb"

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
