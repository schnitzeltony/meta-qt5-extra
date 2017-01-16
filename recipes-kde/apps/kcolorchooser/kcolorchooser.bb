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
SRC_URI[md5sum] = "874e95369735955d827eff0aa69e65d3"
SRC_URI[sha256sum] = "7fe83e765be9de06bde1535e55ef7eb974c78ae8b2b232cc92f5ee71ea1307ef"

FILES_${PN} += " \
    ${datadir}/icons \
"
