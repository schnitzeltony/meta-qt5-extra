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
SRC_URI[md5sum] = "bfecb779782abd51b7a5e8a8a4e25beb"
SRC_URI[sha256sum] = "b0c4e4150aa6595e1a2c6fdd2a38046fa03cf594875fb1e8af284e84c5923211"
SRC_URI += " \
    file://0001-fix-build-with-QT_NO_SESSIONMANAGER-set.patch \
    file://0002-Do-not-use-Q_DECLARE_METATYPE-KPluginMetaData-with-K.patch \
"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/icons \
    ${datadir}/mime \
    ${datadir}/k*5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
