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
SRC_URI[md5sum] = "75eb27efb8710a063bb4b7f247f0ddff"
SRC_URI[sha256sum] = "0c95452ad82e2a5e7bc6bdb4464e7be44b6af9c75a972678f8925e2a6bb15671"

SRC_URI += " \
    file://0001-Set-Kipi-package-properties.patch  \
    file://0002-Avoid-try_run.patch \
"

CXXFLAGS += "-isystem ${STAGING_INCDIR}/phonon4qt5/KDE"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/icons \
    ${datadir}/solid \
    ${datadir}/kconf_update \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
"
