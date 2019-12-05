SUMMARY = "Periodic Table of Elements"
LICENSE = "GPLv2 & GFDL-1.2 & LGPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.LIB;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
    file://COPYING.DOC;md5=d8855fca80aa0b428deafa405d0ea17a \
"

inherit kde-apps gettext pkgconfig gtk-icon-cache

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
SRC_URI[md5sum] = "2fccaa6a98ca5678bf75e0b17dd3c56c"
SRC_URI[sha256sum] = "5dc3423a0f2646b59233f92b6a6e81b4a0bcdb819aa543c83270fe4cc5592933"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/kxmlgui5 \
    ${datadir}/libkdeedu \
"
