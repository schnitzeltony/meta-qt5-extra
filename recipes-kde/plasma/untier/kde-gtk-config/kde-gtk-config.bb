SUMMARY = "GTK2 and GTK3 Configurator for KDE"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

REQUIRED_DISTRO_FEATURES = "x11"

inherit kde-plasma features_check gettext

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
SRC_URI[md5sum] = "bcc375112da568e10b4e6d3b6564c7d3"
SRC_URI[sha256sum] = "a231312cac94354955540efc3d6c28ac1ba793a5e04129007c307352d0cced46"

CFLAGS += "-isystem ${STAGING_INCDIR}/harfbuzz"
CXXFLAGS += "-isystem ${STAGING_INCDIR}/harfbuzz"

FILES_${PN} += " \
    ${datadir}/icons \
    ${datadir}/kcm-gtk-module \
    ${datadir}/knsrcfiles \
    ${datadir}/kservices5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
