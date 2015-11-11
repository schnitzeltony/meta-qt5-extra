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
SRC_URI[md5sum] = "4edc47123a9cb121d475d9aa34706518"
SRC_URI[sha256sum] = "fe346cd5f292f7c9dae28b0f7c1d28c7cfc6551e16043e2701e889735120f8c9"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/kservices5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
"
