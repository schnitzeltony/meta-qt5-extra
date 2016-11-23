SUMMARY = "A very small utility to select a color"
LICENSE = "MIT"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=838c366f69b72c5df05c96dff79b35f2 \
"

inherit kde-apps gtk-icon-cache

DEPENDS += "\
    ki18n \
    kwidgetsaddons \
    kxmlgui \
" 

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "b4d7050dfe24d8cabd5c077fca9eff00"
SRC_URI[sha256sum] = "c0cb5741ada0bc1912348cdff339c15bce3b16f0113a3836b0056982bb706036"

FILES_${PN} += " \
    ${datadir}/icons \
"
