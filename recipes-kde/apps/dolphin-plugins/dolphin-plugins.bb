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
SRC_URI[md5sum] = "c79974123a8c4b3d4e6958af08552c93"
SRC_URI[sha256sum] = "097b1a3f4d62158183d14e29b4c47fe245dfec2f494ed9d361cbe12da6473a6f"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/kservices5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
"
