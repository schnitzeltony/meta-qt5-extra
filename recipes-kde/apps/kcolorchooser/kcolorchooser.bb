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
SRC_URI[md5sum] = "adacf0f8dd552dc23dc7f0b04b5030d7"
SRC_URI[sha256sum] = "f7f46ac20b36047a6065643daac831a5e10458a0563d3bc7627af82e9a4f01ce"

FILES_${PN} += " \
    ${datadir}/icons \
"
