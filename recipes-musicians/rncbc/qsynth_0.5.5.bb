SUMMARY = "Qt GUI Interface for FluidSynth"
HOMEPAGE = "https://qsynth.sourceforge.io/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

DEPENDS += " \
    qtbase-native \
    qttools-native \
    qtbase \
    qtx11extras \
    fluidsynth \
"

inherit qmake5_base autotools-brokensep pkgconfig gtk-icon-cache distro_features_check

REQUIRED_DISTRO_FEATURES = "x11"

SRC_URI = " \
    ${SOURCEFORGE_MIRROR}/project/${BPN}/${BPN}/${PV}/${BPN}-${PV}.tar.gz \
    file://0001-no-Qt4-find-native-qt-build-tools-by-configure-options-auto.patch \
"
SRC_URI[md5sum] = "c5f090b69d101ba912e86b31e2d79c19"
SRC_URI[sha256sum] = "858f52b95642a25f570342d5cf7fafd2a2addb89d567c5b68a3545beb6fda723"

EXTRA_OECONF = " \
    --with-qmake=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/qmake \
    --with-moc=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/moc \
    --with-uic=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/uic \
    --with-lupdate=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/lupdate \
    --with-lrelease=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/lrelease \
"

FILES_${PN} += "${datadir}/metainfo"
