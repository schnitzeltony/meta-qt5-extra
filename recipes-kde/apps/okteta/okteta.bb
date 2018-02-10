SUMMARY = "Okteta is a simple hex editor"
LICENSE = "GPLv2 & GFDL-1.2 & LGPL-2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
    file://COPYING.DOC;md5=24ea4c7092233849b4394699333b5c56 \
"

inherit kde-apps gtk-icon-cache

DEPENDS += " \
    qca \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kbookmarks \
    kcodecs \
    kcompletion \
    kconfigwidgets \
    kdbusaddons \
    kdoctools-native \
    sonnet-native \
    kiconthemes \
    ki18n \
    kcmutils \
    kio \
    knewstuff \
    kparts \
    kservice \
    kwidgetsaddons \
    kxmlgui \
    shared-mime-info-native \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "34ce42a1de0693df09f8f0d16f6159d9"
SRC_URI[sha256sum] = "8dac910adfb4c3a142d9e123a5f5b41e40a8009d955f5377ff61e77d4b158bcc"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${datadir}/config.kcfg \
    ${datadir}/kxmlgui5 \
    ${datadir}/mime \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
    ${OE_QMAKE_PATH_PLUGINS}/*/.debug \
"
