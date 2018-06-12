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
SRC_URI[md5sum] = "5bc9f2fbfae68b8200b75ddbc8ab8889"
SRC_URI[sha256sum] = "020abccf25b18af3e11f67d787be4d3b6df0107ab8f15c946cc00a8804fc1154"

FILES_${PN} += " \
    ${datadir}/icons \
"
