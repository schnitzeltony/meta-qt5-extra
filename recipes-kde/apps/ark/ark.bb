SUMMARY = "Ark is KDE's file archiver"
LICENSE = "GPLv2 & LGPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING.icons;md5=6e01bfa20e899e8ad569d5488923cbd2 \
"

inherit kde-apps gtk-icon-cache

DEPENDS += "\
    libarchive \
    karchive \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kcrash \
    kdbusaddons \
    kdoctools-native \
    ki18n \
    kiconthemes \
    khtml \
    kio \
    kservice \
    kpty \
    kwidgetsaddons \
    kitemmodels \
    sonnet-native \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "842121c3c4b18b33a3c9bef26c64bd87"
SRC_URI[sha256sum] = "0bbd672ac232b6eb7669c8cd1125424e7a0cb3b5e4216e0063d03f1f5c050676"
SRC_URI += "file://0001-fix-build-with-QT_NO_SESSIONMANAGER-set.patch"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/icons \
    ${datadir}/mime \
    ${datadir}/k*5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
    ${OE_QMAKE_PATH_PLUGINS}/*/.debug \
    ${OE_QMAKE_PATH_PLUGINS}/kf5/kio_dnd/.debug \
"
