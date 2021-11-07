SUMMARY = "Settings application for Mobile Devices"
LICENSE = "GPL-2.0 & LGPL-2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde-base pkgconfig

DEPENDS += "\
    kcoreaddons-native \
    kconfig-native \
    kauth-native \
    kdelibs4support-native \
    kdesignerplugin-native \
    kpackage-native \
    kwindowsystem \
    kcoreaddons \
    solid \
    kdbusaddons \
    ki18n \
    plasma-framework \
    kdeclarative \
    kio \
    kdelibs4support \
"

SRC_URI = "git://anongit.kde.org/${BPN}.git;branch=master"
SRCREV = "4975c9034593dfd164dd13e3459ad8594a61ded9"
S = "${WORKDIR}/git"
# Did not find version anywhere
PV = "0.0.0+git${SRCPV}"

FILES:${PN} += " \
    ${datadir}/kservices5 \
    ${datadir}/kpackage \
    ${datadir}/dbus-1 \
    ${datadir}/polkit-1 \
    ${OE_QMAKE_PATH_QML} \
    ${OE_QMAKE_PATH_PLUGINS} \
"
