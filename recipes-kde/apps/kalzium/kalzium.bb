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
SRC_URI[sha256sum] = "1549b5e08caa3ef7cab5375cfb8677dfc02a28a15136bef1edaf93c9fcadad15"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/kxmlgui5 \
    ${datadir}/knsrcfiles \
    ${datadir}/libkdeedu \
"
