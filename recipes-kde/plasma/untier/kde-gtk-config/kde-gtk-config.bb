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
SRC_URI[md5sum] = "972626bf6107585561f9f6335d3f8e16"
SRC_URI[sha256sum] = "0df5feaf437b1a89c92df225e5cb6f18f3729ae87509c3d162c34c5e0526229d"

CFLAGS += "-isystem ${STAGING_INCDIR}/harfbuzz"
CXXFLAGS += "-isystem ${STAGING_INCDIR}/harfbuzz"

FILES_${PN} += " \
    ${datadir}/kcm-gtk-module \
    ${datadir}/kconf_update \
    ${libdir}/kconf_update_bin \
    ${libdir}/gtk-3.0/modules \
    ${OE_QMAKE_PATH_PLUGINS} \
"
