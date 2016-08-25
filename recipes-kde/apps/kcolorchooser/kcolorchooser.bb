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
SRC_URI[md5sum] = "2df7dc5e14fe9f41bec39a643e10cf58"
SRC_URI[sha256sum] = "3f120385ecd5ad7b40d9a84b7d802c209b5e8373a842a988a0f36fd085133a49"

FILES_${PN} += " \
    ${datadir}/icons \
"
