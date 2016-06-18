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
SRC_URI[md5sum] = "8ca2bc86304af4f1bb3609b55f01304f"
SRC_URI[sha256sum] = "13af9a239236c3bb649abfa553be9d0002e4f52da9d6750073219c7fb4cc0920"

FILES_${PN} += " \
    ${datadir}/icons \
"
