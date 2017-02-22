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
SRC_URI[md5sum] = "0ce7bbf17f46fc00450820c43b11d2a4"
SRC_URI[sha256sum] = "43b63456d53346f7ec377f476ecb5f62be36aae93683f75728ab01b14ae2241e"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/kservices5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
"
