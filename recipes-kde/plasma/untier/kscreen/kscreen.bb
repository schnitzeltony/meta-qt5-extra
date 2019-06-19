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
SRC_URI[md5sum] = "a66cd1f12c7b99f6df0fa2a633904fcf"
SRC_URI[sha256sum] = "b90531c0164fdff9fc9f9977aae188c70918d5acc065de47bbe25f3fc06c4c28"

FILES_${PN} += " \
    ${datadir}/k*_kscreen \
    ${datadir}/kservices5 \
    ${datadir}/icons \
    ${datadir}/plasma \
    ${OE_QMAKE_PATH_PLUGINS} \
"
