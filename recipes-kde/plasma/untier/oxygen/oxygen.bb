SUMMARY = "OXYGEN"
LICENSE = "GPL-2.0 & LGPL-2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde-plasma gettext

DEPENDS += " \
    ki18n \
    kauth-native \
    kconfig \
    kconfig-native \
    kcoreaddons-native \
    kguiaddons \
    kwidgetsaddons \
    kservice \
    kcompletion \
    frameworkintegration \
    kwindowsystem \
    kdecoration \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "libxcb qtx11extras", "", d)} \
"


PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "0c3bb29ce140b00e1c95a0a1cb39c662d935f7216e61810837097a39516ec43b"

PACKAGECONFIG ??= ""
PACKAGECONFIG[settings] = "-DBUILD_OXYGEN_SETTINGS=ON,-DBUILD_OXYGEN_SETTINGS=OFF,kcmutils"

FILES:${PN} += " \
    ${datadir}/icons \
    ${datadir}/kservices5 \
    ${datadir}/kstyle \
    ${datadir}/plasma \
    ${datadir}/color-schemes \
    ${OE_QMAKE_PATH_PLUGINS} \
"
