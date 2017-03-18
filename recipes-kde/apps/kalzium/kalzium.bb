SUMMARY = "Periodic Table of Elements"
LICENSE = "GPLv2 & GFDL-1.2 & LGPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.LIB;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
    file://COPYING.DOC;md5=24ea4c7092233849b4394699333b5c56 \
"

inherit kde-apps pythonnative gettext pkgconfig gtk-icon-cache

DEPENDS += " \
    qtsvg \
    libeigen \
    openbabel \
    avogadrolibs \
    \
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
SRC_URI[md5sum] = "72bde526067b7f54ba7d13a69cac5fc7"
SRC_URI[sha256sum] = "50050c85fb1760a99b7bbd0ed0f1047b4456139eb8d3f012005f6106e16a880e"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/kxmlgui5 \
    ${datadir}/libkdeedu \
"
