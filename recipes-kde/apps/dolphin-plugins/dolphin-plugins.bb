SUMMARY = "Plugins for Dolphin"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24"

inherit kde-apps gettext

DEPENDS += "\
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kdesignerplugin-native \
    sonnet-native \
    kxmlgui \
    ki18n \
    kio \
    kdelibs4support-native \
    dolphin \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "2cb35fd8d8cf31e6e7e512c7925fc9bf"
SRC_URI[sha256sum] = "baac9fa8bbc656e1419b4e33915e676bdc234be8a7fd6f33848adf7a85490fc1"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/kservices5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
"
