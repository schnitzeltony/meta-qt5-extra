SUMMARY = "A fast and easy to use image viewer for KDE"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=5a3169a2d39a757efd8b7aa66a69d97b"

inherit kde-apps gettext

DEPENDS += " \
    jpeg \
    exiv2 \
    lcms \
    phonon \
    kdelibs4support \
    kdelibs4support-native \
    kded \
    kactivities \
    kcoreaddons-native \
    kconfig-native \
    kauth-native \
    kdesignerplugin-native \
    sonnet-native \
    kxmlgui \
    kfilemetadata \
    baloo \
    libkdcraw \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "5ff7266c47db9e5ddbb3aa0e6e34c980"
SRC_URI[sha256sum] = "1d1d4713bcebdd8c7c458c075b7101055c81cf94a802ac8b9b3528a3c3c961a3"

SRC_URI += " \
    file://0001-Avoid-try_run.patch \
"

CXXFLAGS += "-isystem ${STAGING_INCDIR}/phonon4qt5/KDE"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/icons \
    ${datadir}/solid \
    ${datadir}/kconf_update \
    ${OE_QMAKE_PATH_PLUGINS} \
"
