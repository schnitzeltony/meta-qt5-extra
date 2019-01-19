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

inherit qmake5_base autotools-brokensep pkgconfig gtk-icon-cache mime

SRC_URI = " \
    ${SOURCEFORGE_MIRROR}/project/${BPN}/${BPN}/${PV}/${BPN}-${PV}.tar.gz \
    ${SOURCEFORGE_MIRROR}/project/autostatic/autostatic-synthv1-presets/autostatic-synthv1-presets1.tar.gz;name=autostatic-synthv1-presets1 \
    http://linuxsynths.com/Synthv1PatchesDemos/Synthv1Patches06.tar.gz;name=linuxsynths-synthv1-presets;subdir=linuxsynths-synthv1-presets \
    file://0001-no-Qt4-find-native-qt-build-tools-by-configure-options-auto.patch \
    file://0002-Remove-extra-rpath.patch \
    \
    file://lv2-backport/0001-Comply-with-next-LV2-headers-location-post-1.14.0git.patch \
    file://lv2-backport/0002-Comply-with-next-LV2-headers-location-post-1.14.0git.patch \
    file://lv2-backport/0003-Comply-with-next-LV2-headers-location-post-1.14.0git.patch \
    \
    file://synthv1.conf \
"
SRC_URI[md5sum] = "f909bfb55e3d23f7308478ab07477486"
SRC_URI[sha256sum] = "dbcb240456361bd7a61e62c4c481308b6b55586f2b0d973d5fd63ef44890b2a3"

SRC_URI[autostatic-synthv1-presets1.md5sum] = "02210e5576310554cfe316fb72e88b74"
SRC_URI[autostatic-synthv1-presets1.sha256sum] = "587ac8cb4cb645fc71603d1b4b351b24f3e4d9f15a53aca59c0f30cc9f66e253"

SRC_URI[linuxsynths-synthv1-presets.md5sum] = "88997ed87dd6adf929668751d11d91d2"
SRC_URI[linuxsynths-synthv1-presets.sha256sum] = "cd444ccecafa9c03b890b3662455e3c1f36e18cd8f2f9b5c269bf1e4eb6cfa72"

EXTRA_OECONF = " \
    --with-qmake=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/qmake \
    --with-moc=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/moc \
    --with-uic=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/uic \
    --with-lupdate=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/lupdate \
    --with-lrelease=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/lrelease \
"

do_install_append() {
    install -d ${D}/${datadir}/${BPN}/presets
    cp ${WORKDIR}/autostatic-synthv1-presets1/*.synthv1 ${D}/${datadir}/${BPN}/presets
    cp ${WORKDIR}/linuxsynths-synthv1-presets/*.synthv1 ${D}/${datadir}/${BPN}/presets

    install -d ${D}/${sysconfdir}/skel/.config/rncbc.org
    install -m 0644 ${WORKDIR}/${BPN}.conf ${D}/${sysconfdir}/skel/.config/rncbc.org/
}

PACKAGES =+ "${PN}-presets"

FILES_${PN} += " \
    ${datadir}/appdata \
    ${datadir}/mime \
    ${datadir}/icons \
    ${datadir}/metainfo \
    ${libdir}/lv2 \
"

FILES_${PN}-presets += " \
    ${sysconfdir}/skel/.config/rncbc.org \
    ${datadir}/${BPN}/presets/ \
"
