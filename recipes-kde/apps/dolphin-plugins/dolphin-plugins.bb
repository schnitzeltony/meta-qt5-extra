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
SRC_URI[md5sum] = "19582284cc59be78fe3313ac9728c480"
SRC_URI[sha256sum] = "7497ca4c86839b45d3ca6138d720ebd045af9f426977dcbafbf53adb4e70bad6"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/kservices5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
"
