SUMMARY = "Plugins for Dolphin"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24"

inherit kde-apps gettext

DEPENDS += "\
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kdesignerplugin-native \
    kdelibs4support-native \
    kdelibs4support \
    sonnet-native \
    kxmlgui \
    ki18n \
    kio \
    dolphin \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "ea42d71187245acdf204aa03610b41f5"
SRC_URI[sha256sum] = "8324e4552d896970c90f9c63f202979b6520f18f291f4fa8b9baf33c25105e42"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/kservices5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
"
