SUMMARY = "Ark is KDE's file archiver"
LICENSE = "GPL-2.0 & LGPL-3.0"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING.icons;md5=78d89b1a70de936b57b7231c94b75ca6 \
"

inherit kde-apps gtk-icon-cache mime mime-xdg

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
SRC_URI[sha256sum] = "09e0294c36a881585183bf165020ef832bfbbd181547ea26eb78268aab46a768"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/icons \
    ${datadir}/mime \
    ${datadir}/k*5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
