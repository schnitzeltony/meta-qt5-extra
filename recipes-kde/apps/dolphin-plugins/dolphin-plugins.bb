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
SRC_URI[md5sum] = "86f301d2af92dcaf149cd0f725a9fad2"
SRC_URI[sha256sum] = "9ee8aba472aff1b8e376ee29e74d21bf79d38ca577f5987f670ab4490ac50098"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/kservices5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
"
