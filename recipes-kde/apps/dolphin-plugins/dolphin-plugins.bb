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
SRC_URI[md5sum] = "a7807b3bcfe1cda7ad0bb34b468a4833"
SRC_URI[sha256sum] = "a90bc65485adf95e230b979effda5addbf7464555551f3c957f98ec17fa55fa1"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/kservices5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
"
