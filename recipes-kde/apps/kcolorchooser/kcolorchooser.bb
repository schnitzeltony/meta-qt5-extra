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
SRC_URI[md5sum] = "27694d9898677a4a6baf096523dff0d5"
SRC_URI[sha256sum] = "3f0402ee8d542f1291cef8b5299d70016e0fda057f566e7d229b8f1281bdb37d"

FILES_${PN} += " \
    ${datadir}/icons \
"
