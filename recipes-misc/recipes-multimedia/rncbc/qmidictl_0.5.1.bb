SUMMARY = "A MIDI Network Gateway via UDP/IP Multicast"
HOMEPAGE = "http://qmidinet.sourceforge.net"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

DEPENDS += " \
    qtbase-native \
    qttools-native \
    qtbase \
"

# autotools-brokensep must be after qmake5_base!
inherit qmake5_base autotools-brokensep gtk-icon-cache qt5-translation

SRC_URI = " \
    ${SOURCEFORGE_MIRROR}/project/${BPN}/${BPN}/${PV}/${BPN}-${PV}.tar.gz \
    file://0001-find-native-qt-build-tools-by-configure-options-auto.patch \
"
SRC_URI[md5sum] = "4c64dca2e7c6d15d4eb95bb3a4c6bd96"
SRC_URI[sha256sum] = "b20e02e87dc4346911c8494c44831c0beba3514b57bb50b9548af6a0a182db16"

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
