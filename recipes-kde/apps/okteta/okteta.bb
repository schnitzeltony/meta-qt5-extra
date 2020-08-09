SUMMARY = "Okteta is a simple hex editor"
LICENSE = "GPLv3 & GFDL-1.2 & LGPLv3"
LIC_FILES_CHKSUM = " \
    file://LICENSES/LicenseRef-KDE-Accepted-GPL.txt;md5=b4c280013bbbadfbe92219498dc5228c \
    file://LICENSES/LicenseRef-KDE-Accepted-LGPL.txt;md5=e4b79a181b6483b37d39a27f4d75e60a \
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
PV = "0.26.4"
SRC_URI = "https://download.kde.org/stable/okteta/${PV}/src/${BPN}-${PV}.tar.xz"
SRC_URI[sha256sum] = "ef22b096c4d8a682b5467ee7d8e9e05ede44cde116daef804312745c4bfd0f03"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/k*5 \
    ${datadir}/mime \
    ${datadir}/knsrcfiles \
    ${OE_QMAKE_PATH_PLUGINS} \
"
