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
SRC_URI[md5sum] = "c69b801ba9428f15a3bc3808eb60b618"
SRC_URI[sha256sum] = "713d1151f45382d8a889187ebb02f8e73ffbf28ac8abea0e03626888711d2c22"

FILES_${PN} += " \
    ${datadir}/icons \
"
