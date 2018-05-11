SUMMARY = "JACK Audio Connection Kit - Qt GUI Interface"
HOMEPAGE = "http://qjackctl.sourceforge.net"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

DEPENDS += " \
    qtbase-native \
    qttools-native \
    qtbase \
    jack \
    qtx11extras \
    portaudio-v19 \
"

# autotools-brokensep must be after qmake5_base!
inherit qmake5_base autotools-brokensep gtk-icon-cache qt5-translation

SRC_URI = " \
    ${SOURCEFORGE_MIRROR}/project/${BPN}/${BPN}/${PV}/${BPN}-${PV}.tar.gz \
    file://0001-find-native-qt-build-tools-by-configure-options-auto.patch \
    file://QjackCtl.conf \
"
SRC_URI[md5sum] = "5e7e2a03f700b62578d1a712f3c9bf28"
SRC_URI[sha256sum] = "9a74f33f6643bea8bf742ea54f9b40f08ed339887f076ff3068159c55d0ba853"

EXTRA_OECONF = " \
    --with-qmake=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/qmake \
    --with-moc=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/moc \
    --with-uic=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/uic \
    --with-lupdate=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/lupdate \
    --with-lrelease=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/lrelease \
"

FILES_${PN} += " \
    ${datadir}/metainfo \
"

do_install_append() {
    install -d ${D}/${sysconfdir}/skel/.config/rncbc.org
    install -m 0644 ${WORKDIR}/QjackCtl.conf ${D}/${sysconfdir}/skel/.config/rncbc.org/
}

PACKAGES =+ "${PN}-defconfig"

FILES_${PN}-defconfig = " \
    ${sysconfdir}/skel/.config/rncbc.org \
"

RDEPENDS_${PN} += " \
    jack-server \
"

RDEPENDS_${PN}}-defconfig += " \
    a2jmidi \
    audio-tweaks \
"
