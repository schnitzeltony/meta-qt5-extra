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
SRC_URI[md5sum] = "232f15146937ab39103ece84a251ee8d"
SRC_URI[sha256sum] = "ce35f554014cee819767180f0c9381d539e497edfb9c290b279fa78e9dea4bb0"

FILES_${PN} += " \
    ${datadir}/k*_kscreen \
    ${datadir}/kservices5 \
    ${datadir}/icons \
    ${datadir}/plasma \
    ${OE_QMAKE_PATH_PLUGINS} \
"
