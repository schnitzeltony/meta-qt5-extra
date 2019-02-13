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
SRC_URI[md5sum] = "88267a7ead8638eed4ff8ba12e27a8e8"
SRC_URI[sha256sum] = "d849e1488be7a832f494638d557ad77b40440461ed3c0dbac3e8a6016b2c427f"

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
