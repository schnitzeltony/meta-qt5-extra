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
SRC_URI[md5sum] = "e4df50ff79d0a43ee1e61f55eef88150"
SRC_URI[sha256sum] = "0f0c8a306f392573bd912a21c298734af4b73a7faec0b5fe7548d5a3ae1b4b54"
SRC_URI += " \
    file://0001-fix-build-with-QT_NO_SESSIONMANAGER-set.patch \
"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/icons \
    ${datadir}/mime \
    ${datadir}/k*5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
