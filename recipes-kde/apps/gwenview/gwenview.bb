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
SRC_URI[md5sum] = "20774653ecf548ceeeae6b0fcdccd87b"
SRC_URI[sha256sum] = "146aa96420d3af800371ec37964e35484309db975d71761ac3bb2ff9c95f9209"

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
