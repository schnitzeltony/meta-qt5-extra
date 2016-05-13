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
SRC_URI[md5sum] = "a070d4d442294738ebf7c7615bf97668"
SRC_URI[sha256sum] = "7b82c17077186a08cb6589f49a9d2054bdea02a03b5e42b5a1429e478b462e35"

FILES_${PN} += " \
    ${datadir}/icons \
"
