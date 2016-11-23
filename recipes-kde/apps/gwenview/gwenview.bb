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
SRC_URI[md5sum] = "bc094c329acfd145e0767e3e03a6fba3"
SRC_URI[sha256sum] = "a31fa161d657ad89e659360956660bfc679e3e97e0f3d38664d5380e59695688"

SRC_URI += " \
    file://0001-Fix-package-name.patch  \
    file://0002-Set-Kipi-package-properties.patch  \
    file://0003-Avoid-try_run.patch \
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
