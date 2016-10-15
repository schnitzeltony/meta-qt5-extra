SUMMARY = "Plugins for Dolphin"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24"

inherit kde-apps

DEPENDS += "\
    kxmlgui \
    ki18n \
    kio \
    kdelibs4support \
    dolphin \
" 

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "6de4a68a79d1131d8621c609eb724a02"
SRC_URI[sha256sum] = "6dd8e224e33f158974744cf98d6666806657ad75e9690849fc02e873e873ec32"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/kservices5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
"
