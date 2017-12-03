SUMMARY = "An old-school drum kit sampler"
HOMEPAGE = "http://drumkv1.sourceforge.net/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

DEPENDS += " \
    qtbase-native \
    qtbase \
    jack \
    lv2 \
    liblo \
"

inherit qmake5_base autotools-brokensep pkgconfig gtk-icon-cache mime

SRC_URI = " \
    ${SOURCEFORGE_MIRROR}/project/${BPN}/${BPN}/${PV}/${BPN}-${PV}.tar.gz \
    git://github.com/marado/drumkv1-audiophob.git;name=audiophob;destsuffix=audiophob \
    file://0001-find-native-qt-build-tools-by-configure-options-auto.patch \
"
SRC_URI[md5sum] = "496a92a5648aeab656c16b168a8a6383"
SRC_URI[sha256sum] = "cfc9373b8ac38235c8086e27b8699fa0b057c4d8aa9fd98f16f756ea43c5b81b"

SRCREV_audiophob = "903639b36bd7ffcb7c96893d558c6653d8e249cc"

EXTRA_OECONF = " \
    --with-qmake=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/qmake \
    --with-moc=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/moc \
    --with-uic=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/uic \
    --with-lupdate=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/lupdate \
    --with-lrelease=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/lrelease \
"

do_install_append() {
    install -d ${D}${datadir}/${BPN}/presets
    install -m 0644 ${WORKDIR}/audiophob/*.wav ${D}${datadir}/${BPN}/presets/
    install -m 0644 ${WORKDIR}/audiophob/*.drumkv1 ${D}${datadir}/${BPN}/presets/
}

PACKAGES =+ "${PN}-presets"

FILES_${PN} += " \
    ${datadir}/appdata \
    ${datadir}/mime \
    ${datadir}/metainfo \
    ${datadir}/icons \
    ${libdir}/lv2 \
"

FILES_${PN}-presets += "${datadir}/${BPN}/presets/"
