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
SRC_URI[md5sum] = "dd4145c98323bffc1d93db2916fdf0db"
SRC_URI[sha256sum] = "2dc0028ae226c72531fbcd6ad2193e8ec8018c9ab7d03bfb754fcd805c304ed0"

FILES_${PN} += " \
    ${datadir}/icons \
"
