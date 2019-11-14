SUMMARY = "A collection of package management tools for Debian-based systems"
LICENSE = "GPLv2 & LGPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.LGPL-2;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
    file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde-plasma gtk-icon-cache

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "03d4d20efeb96a2c2ec5e6b1d5e856e1"
SRC_URI[sha256sum] = "fcb5fb7f31653aafe0f7d5fe56947cd20b6bfea3a85e973dceeaf93c83459d8d"

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
