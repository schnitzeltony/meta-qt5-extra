SUMMARY = "Property editing framework with editor widget"
HOMEPAGE = "https://community.kde.org/KProperty"
LICENSE = "LGPLv2 & GFDL-1.2 & BSD"
LIC_FILES_CHKSUM = " \
    file://COPYING.LIB;md5=3dcc9b0b0118292a0c5d1c18927ef176 \
    file://COPYING-CMAKE-SCRIPTS;md5=3775480a712fc46a69647678acb234cb \
"

inherit kde-apps

DEPENDS += " \
    kcoreaddons-native \
    kcoreaddons \
    kconfig-native \
    kconfig \
    kwidgetsaddons \
    kguiaddons \
"

SRC_URI = "${KDE_MIRROR}/stable/${BPN}/src/${BPN}-${PV}.tar.xz"
SRC_URI[md5sum] = "ee888d41a677ddc6b8c63f0f71e82026"
SRC_URI[sha256sum] = "7ede8ee868ba480e4666a32b4b26d279b1e45177f83b0ada32a15fa9cee514a3"

FILES_${PN} += " \
    ${datadir}/kpropertywidgets3 \
    ${datadir}/kservicetypes5 \
    ${datadir}/kreport3 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
