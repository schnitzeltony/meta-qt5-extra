SUMMARY = "KDE's screen management software"
LICENSE = "GPL-2.0 & LGPL-2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.LGPL;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde-plasma gettext

DEPENDS += "\
    qtdeclarative \
    qtsensors \
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
SRC_URI[sha256sum] = "5f805e8d3b269fc1f7a9d2f582e49c9b173bd3eb0fd7393ff3b4d7980335519f"

FILES_${PN} += " \
    ${datadir}/k*_kscreen \
    ${datadir}/kservices5 \
    ${datadir}/plasma \
    ${datadir}/kpackage \
    ${OE_QMAKE_PATH_PLUGINS} \
"
