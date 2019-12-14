SUMMARY = "Okteta is a simple hex editor"
LICENSE = "GPLv2 & GFDL-1.2 & LGPL-2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
    file://COPYING.DOC;md5=24ea4c7092233849b4394699333b5c56 \
"

inherit kde-apps gtk-icon-cache mime

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

# After 17.2.3 okteta left KDE application release cycle and continued
# with 0.25.0. To avoid package version going backwards set epoch;
PE = "1"

SRC_URI = "https://download.kde.org/stable/okteta/${PV}/src/${BPN}-${PV}.tar.xz"
SRC_URI[md5sum] = "69b3b9189bb71dac3b49da5380721684"
SRC_URI[sha256sum] = "bb8d819af1d2d7ebb286542918985afcd1937f0ec6172180ff5b1acc5383684c"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${datadir}/config.kcfg \
    ${datadir}/k*5 \
    ${datadir}/mime \
"
