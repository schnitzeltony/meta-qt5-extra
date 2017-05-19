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
SRC_URI[md5sum] = "7dc1eef924dd7461bdf46beec4ee839b"
SRC_URI[sha256sum] = "55e19fd002e866fb7a3f182870251871ff4ff84935ea58e1eaaa00340c10285b"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/kservices5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
"
