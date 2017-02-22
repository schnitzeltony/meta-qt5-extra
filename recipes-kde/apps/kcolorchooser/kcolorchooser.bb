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
SRC_URI[md5sum] = "f1c55b5a19d1880fba88672e19c244aa"
SRC_URI[sha256sum] = "75b30f2f3d40e949597e1bd39375eb4a48869c49188ade8d065c2e005a94fa1e"

FILES_${PN} += " \
    ${datadir}/icons \
"
