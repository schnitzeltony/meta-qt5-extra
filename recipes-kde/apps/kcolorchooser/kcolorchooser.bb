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
SRC_URI[md5sum] = "6dbd6ec3ca6be3d9fcef4615a83a1ff4"
SRC_URI[sha256sum] = "cbb30cc704837e88553546e7a0ea3b5c3f875fbff114a0bfa9838a3f68dfd38e"

FILES_${PN} += " \
    ${datadir}/icons \
"
