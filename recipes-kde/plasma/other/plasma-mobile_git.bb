SUMMARY = "A complete Plasma workspace targeted from small handheld devices to larger tablets"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://LICENSE.GPL-2;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://LICENSE.LGPL-2.1;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde-base gtk-icon-cache

DEPENDS += "\
    plasma-framework \
    kdeclarative \
    kio \
    kdelibs4support \
    kdelibs4support-native \
    kactivities \
    baloo \
    kcoreaddons-native \
    kconfig-native \
    kauth-native \
    sonnet-native \
    kpackage-native \
    kdesignerplugin-native \
"

SRC_URI = "git://anongit.kde.org/${BPN}.git"
SRCREV = "8005327e22c54b1e7e4be20c844819a43aa7d108"
S = "${WORKDIR}/git"
# Did not find version anywhere
PV = "0.0.0+git${SRCPV}"

FILES_${PN} += " \
    ${datadir}/icons \
    ${datadir}/k*5 \
    ${datadir}/plasma \
    ${datadir}/solid \
    ${OE_QMAKE_PATH_QML} \
"
