SUMMARY = "A complete Plasma workspace targeted from small handheld devices to larger tablets"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://LICENSE.GPL-2;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://LICENSE.LGPL-2.1;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde-base gtk-icon-cache

DEPENDS += "\
    plasma-framework \
    plasma-desktop \
    kdeclarative \
    kio \
    kactivities \
    baloo \
    kcoreaddons-native \
    kcoreaddons \
    kconfig-native \
    kauth-native \
    sonnet-native \
    kpackage-native \
    kdesignerplugin-native \
"

SRC_URI = "git://anongit.kde.org/${BPN}.git"
SRCREV = "05676493808bbfafbc867392c541f799c8e25779"
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

RDEPENDS_${PN} += "qtquickcontrols-qmlplugins"
