SUMMARY = "JA MIDI Remote Controller via UDP/IP Multicast"
HOMEPAGE = "http://qmidictl.sourceforge.net"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

DEPENDS += " \
    qtbase-native \
    qttools-native \
    qtbase \
    jack \
"

# autotools-brokensep must be after qmake5_base!
inherit qmake5_base autotools-brokensep gtk-icon-cache qt5-translation

SRC_URI = " \
    ${SOURCEFORGE_MIRROR}/project/${BPN}/${BPN}/${PV}/${BPN}-${PV}.tar.gz \
    file://0001-find-native-qt-build-tools-by-configure-options-auto.patch \
"
SRC_URI[md5sum] = "16c8ead283aec2002422036ef7dfd374"
SRC_URI[sha256sum] = "205817e7e89ea8ab229813fcaaa7769a6a4fbb77d98b20cfff1755abc28f2652"

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

RDEPENDS_${PN} += "jack-server"
