SUMMARY = "A collection of package management tools for Debian-based systems"
LICENSE = "GPLv2 & LGPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.LGPL-2;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
    file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde-plasma gtk-icon-cache

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "f2c1e4e95bf01106c2f9b434366258c3"
SRC_URI[sha256sum] = "5e26547c97cfba5f209df239298869c24d2ba2bb0594e90eb0d985f0b16dc9d7"

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
