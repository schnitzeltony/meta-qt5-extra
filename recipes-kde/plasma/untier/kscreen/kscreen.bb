SUMMARY = "KDE's screen management software"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.LGPL;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde-plasma gettext

DEPENDS += "\
    qtdeclarative \
    \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kpackage-native \
    kdbusaddons \
    kconfig \
    kconfigwidgets \
    ki18n \
    kxmlgui \
    kglobalaccel \
    kwidgetsaddons \
    kdeclarative \
	kiconthemes \
    plasma-framework \
    libkscreen \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "244d653fd0e529e71f14b512aba2fd89"
SRC_URI[sha256sum] = "9a1e689f0b8ac69fd9c471a5f4f54a846c1ec8a1914ab9b71754a81cd4c5d6ee"

FILES_${PN} += " \
    ${datadir}/k*_kscreen \
    ${datadir}/kservices5 \
    ${datadir}/plasma \
    ${datadir}/kpackage \
    ${OE_QMAKE_PATH_PLUGINS} \
"
