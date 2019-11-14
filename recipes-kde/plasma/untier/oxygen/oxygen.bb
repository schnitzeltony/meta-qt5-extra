SUMMARY = "OXYGEN"
LICENSE = "GPLv2 & LGPLv2.1"
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
SRC_URI[md5sum] = "ebb0a647b32cfc99db0fd41c418ee007"
SRC_URI[sha256sum] = "b514bd99638850237a4adc88b485920fbd04fe6646a0669ec7934d6613c143aa"
SRC_URI += "file://0001-kstyle-add-an-option-BUILD_OXYGEN_SETTINGS-disabled-.patch"

PACKAGECONFIG ??= ""
PACKAGECONFIG[settings] = "-DBUILD_OXYGEN_SETTINGS=ON,-DBUILD_OXYGEN_SETTINGS=OFF,kcmutils"

FILES_${PN} += " \
    ${datadir}/icons \
    ${datadir}/kservices5 \
    ${datadir}/kstyle \
    ${datadir}/plasma \
    ${datadir}/color-schemes \
    ${OE_QMAKE_PATH_PLUGINS} \
"
