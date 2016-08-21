SUMMARY = "JACK Audio Connection Kit - Qt GUI Interface"
HOMEPAGE = "http://qjackctl.sourceforge.net"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

DEPENDS += " \
    qtbase \
    jack \
    qtx11extras \
    portaudio-v19 \
"

inherit autotools qmake5_base gtk-icon-cache

B = "${S}"

SRC_URI = " \
    ${SOURCEFORGE_MIRROR}/project/${BPN}/${BPN}/${PV}/${BPN}-${PV}.tar.gz \
    file://0001-find-native-qt-build-tools-by-configure-options-auto.patch \
    file://0002-configure.ac-do-not-der-absolute-default-paths.patch \
"
SRC_URI[md5sum] = "272cacd4878521e4ba43fd23b19da8a5"
SRC_URI[sha256sum] = "cf1c4aff22f8410feba9122e447b1e28c8fa2c71b12cfc0551755d351f9eaf5e"

EXTRA_OECONF = " \
    --with-qmake=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/qmake \
    --with-moc=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/moc \
    --with-uic=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/uic \
    --with-lupdate=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/lupdate \
    --with-lrelease=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/lrelease \
"

FILES_${PN} += " \
    ${datadir}/appdata \
"
