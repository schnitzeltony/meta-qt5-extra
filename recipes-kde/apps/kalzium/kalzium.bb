SUMMARY = "Periodic Table of Elements"
LICENSE = "GPL-2.0 & GFDL-1.2 & LGPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.LIB;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
    file://COPYING.DOC;md5=d8855fca80aa0b428deafa405d0ea17a \
"

# avogadrolibs -> glew
REQUIRED_DISTRO_FEATURES = "opengl"

inherit kde-apps gettext pkgconfig gtk-icon-cache mime-xdg features_check

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
SRC_URI[sha256sum] = "d9f2d98376a1bef272915c153b4a596ffcf6b74d7709a193198fd75914661d8c"

FILES:${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/kxmlgui5 \
    ${datadir}/knsrcfiles \
    ${datadir}/libkdeedu \
"
