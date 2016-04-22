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
SRC_URI[md5sum] = "aeaa4011d9b5cbddb5c721aeee9bf85e"
SRC_URI[sha256sum] = "a313e1297d6060001e15b640347f790c7fa57301eb2d1ef51e3ad0fc71854a50"

FILES_${PN} += " \
    ${datadir}/icons \
"
