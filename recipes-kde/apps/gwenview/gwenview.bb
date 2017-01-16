SUMMARY = "A fast and easy to use image viewer for KDE"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=5a3169a2d39a757efd8b7aa66a69d97b"

inherit kde-apps

DEPENDS += " \
    jpeg \
    exiv2 \
    lcms \
    phonon \
    kdelibs4support \
    kded \
    kactivities \
    kcoreaddons \
    kxmlgui \
    kfilemetadata \
    baloo \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "1d1ac5a3f9f9639b898db4008b9b52e6"
SRC_URI[sha256sum] = "255df6966b34278a3375880ff6ff31000cc52ea69285e5da5e95a3c4ff782c64"

SRC_URI += " \
    file://0001-Set-Kipi-package-properties.patch  \
    file://0002-Avoid-try_run.patch \
"

CXXFLAGS += "-isystem ${STAGING_INCDIR}/phonon4qt5/KDE"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/icons \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
"
