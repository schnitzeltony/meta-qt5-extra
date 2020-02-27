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
SRC_URI[md5sum] = "d75b304eb6059aec952abf1aeb15d62f"
SRC_URI[sha256sum] = "6285acf54816d8c63e11ff97699e3818dbdef5a596273b340f2f6c4e3a2d6c41"

CFLAGS += "-isystem ${STAGING_INCDIR}/harfbuzz"
CXXFLAGS += "-isystem ${STAGING_INCDIR}/harfbuzz"

FILES_${PN} += " \
    ${datadir}/kcm-gtk-module \
    ${datadir}/kconf_update \
    ${libdir}/kconf_update_bin \
    ${OE_QMAKE_PATH_PLUGINS} \
"
