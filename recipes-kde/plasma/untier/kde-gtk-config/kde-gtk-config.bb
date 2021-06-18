SUMMARY = "GTK2 and GTK3 Configurator for KDE"
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0 & GPL-2.0+ & GPL-3.0"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-2-Clause.txt;md5=63d6ee386b8aaba70b1bf15a79ca50f2 \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/GPL-3.0-only.txt;md5=1c76c4cc354acaac30ed4d5eefea7245 \
"

REQUIRED_DISTRO_FEATURES = "x11"

inherit kde-plasma features_check gettext

DEPENDS += " \
    sassc-native \
    gtk+ \
    gtk+3 \
    gsettings-desktop-schemas \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    ki18n \
    kconfigwidgets \
    knewstuff \
    karchive \
    kcmutils \
    kdecoration \
"

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "7093ba1c0a33de261e8fcd3d09534601c32b2514f64d45bdc62a196208c67319"

CFLAGS += "-isystem ${STAGING_INCDIR}/harfbuzz"
CXXFLAGS += "-isystem ${STAGING_INCDIR}/harfbuzz"

FILES_${PN} += " \
    ${datadir}/kcm-gtk-module \
    ${datadir}/kconf_update \
    ${datadir}/themes \
    ${libdir}/kconf_update_bin \
    ${libdir}/gtk-3.0/modules \
    ${OE_QMAKE_PATH_PLUGINS} \
"
