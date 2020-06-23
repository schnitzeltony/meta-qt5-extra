SUMMARY = "A collection of package management tools for Debian-based systems"
LICENSE = "GPLv2 & LGPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.LGPL-2;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
    file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde-plasma gtk-icon-cache

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "357b0fb7e5460ed99c47a3082119ff3e"
SRC_URI[sha256sum] = "4d87c8f3857cfd55e4b1193262dae5157cdcb3ecbc48c7d22ba230028393de09"

DEPENDS += " \
    kauth-native \
    kconfig-native \
    ki18n-native \
    kcoreaddons-native \
    kpackage-native \
    kactivities \
    kconfigwidgets \
    kdbusaddons \
    kio \
    plasma-framework \
    kwidgetsaddons \
    ksysguard \
    networkmanager-qt \
"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/plasma \
    ${OE_QMAKE_PATH_PLUGINS} \
"
