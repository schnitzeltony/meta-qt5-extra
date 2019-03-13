SUMMARY = "GTK2 and GTK3 Configurator for KDE"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

REQUIRED_DISTRO_FEATURES = "x11"

inherit kde-plasma distro_features_check gettext

DEPENDS += " \
    gtk+ \
    gtk+3 \
    gsettings-desktop-schemas \
    ki18n \
    kauth-native \
    kconfig-native \
    kconfigwidgets \
    kcoreaddons-native \
    knewstuff \
    karchive \
    kcmutils \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "fc76a4f8bdb2a031fdadff946514ae3d"
SRC_URI[sha256sum] = "488f678d65352f74b96149371f49098be8f22adbdbceb9d2699e8beeb4115cfb"

FILES_${PN} += " \
    ${datadir}/kservices5 \
    ${datadir}/kcm-gtk-module \
    ${datadir}/icons \
    ${OE_QMAKE_PATH_PLUGINS} \
"
