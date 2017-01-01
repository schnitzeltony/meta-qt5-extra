SUMMARY = "GTK2 and GTK3 Configurator for KDE"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

REQUIRED_DISTRO_FEATURES = "x11"

inherit kde-plasma distro_features_check

DEPENDS += " \
    gtk+ \
    gtk+3 \
    ki18n \
    kconfigwidgets \
    knewstuff \
    karchive \
    kcmutils \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "85e4166cabbbf62217514dcca2b55cce"
SRC_URI[sha256sum] = "399464281ae04425a1881f4fc26a40c0e2079a6246dfab2e52a361d86afd15c8"

SRC_URI += "file://0001-fix-for-gtk2-only-and-gtk3-only-environments.patch"

FILES_${PN} += " \
    ${datadir}/kservices5 \
    ${datadir}/kcm-gtk-module \
    ${datadir}/icons \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
"
