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
SRC_URI[md5sum] = "937824ad2d27d49c31a6b302dbf016ba"
SRC_URI[sha256sum] = "d25e45e31ead82e06a1091626a906a9e8cf023b4595b631b9b89be0a15b74575"

CFLAGS += "-isystem ${STAGING_INCDIR}/harfbuzz"
CXXFLAGS += "-isystem ${STAGING_INCDIR}/harfbuzz"

FILES_${PN} += " \
    ${datadir}/icons \
    ${datadir}/kcm-gtk-module \
    ${datadir}/knsrcfiles \
    ${datadir}/kservices5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
