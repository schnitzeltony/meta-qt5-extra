SUMMARY = "Periodic Table of Elements"
LICENSE = "GPLv2 & GFDL-1.2 & LGPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.LIB;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
    file://COPYING.DOC;md5=d8855fca80aa0b428deafa405d0ea17a \
"

inherit kde-apps gettext pkgconfig gtk-icon-cache mime-xdg

DEPENDS += " \
    qtsvg \
    libeigen \
    openbabel \
    avogadrolibs \
    \
    kcoreaddons-native \
    kconfig-native \
    kdoctools-native \
    kauth-native \
    karchive \
    kconfig \
    kcoreaddons \
    kdoctools \
    ki18n \
    kdelibs4support \
    khtml \
    knewstuff \
    kparts \
    kplotting \
    solid \
    kunitconversion \
    kwidgetsaddons \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "1871cfe36d64c24c4296de453a9639b1"
SRC_URI[sha256sum] = "b884fc8c13c3618a73e3ecfd265660e7045245059a951aff32c12ee5981902ca"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/kxmlgui5 \
    ${datadir}/libkdeedu \
"
