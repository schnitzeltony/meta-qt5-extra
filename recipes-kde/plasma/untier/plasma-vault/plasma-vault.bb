SUMMARY = "A collection of package management tools for Debian-based systems"
LICENSE = "GPL-2.0 & LGPL-2.0 & LGPL-2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.LGPL-2;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
    file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde-plasma gtk-icon-cache

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "c577135b04d7b35227183100fcae08eaf6df5ef41c4ecf43e0706a329ef8a48d"

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
