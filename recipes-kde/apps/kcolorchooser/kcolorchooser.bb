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
SRC_URI[md5sum] = "a8c0c85d21beb2e96ee956619a3f5155"
SRC_URI[sha256sum] = "0bbaa954d2eba84766aa3106152dffda29b5036fdc995d6c756ad577958e497d"

FILES_${PN} += " \
    ${datadir}/icons \
"
