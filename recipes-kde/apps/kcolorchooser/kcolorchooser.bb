SUMMARY = "A very small utility to select a color"
LICENSE = "MIT"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=838c366f69b72c5df05c96dff79b35f2 \
"

inherit kde-apps gtk-icon-cache

DEPENDS += "\
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    ki18n \
    kwidgetsaddons \
    kxmlgui \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "929106474428d4c3aa33048b4a57aab2"
SRC_URI[sha256sum] = "276cee46f92eeb5b47ec09366498b117c657fb2e618fc9fe34c797d4384549fd"

FILES_${PN} += " \
    ${datadir}/icons \
"
