SUMMARY = "A collection of package management tools for Debian-based systems"
LICENSE = "GPLv2 & LGPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.LGPL-2;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
    file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde-plasma gtk-icon-cache

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "21e322784f37c44ffa9f4e0ef50e1004"
SRC_URI[sha256sum] = "f3aa2a9901ad198d8850b6891e74b684f29ba6ab5fd40eba0240039069576dc2"

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
"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/plasma \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
"
