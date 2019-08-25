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
SRC_URI[md5sum] = "00101a3953d752e1f59e168c42918edd"
SRC_URI[sha256sum] = "bd9fa8940218f686b0a2d8c6fbe38b996646508a1908dd53925c2513f6fd39eb"

FILES_${PN} += " \
    ${datadir}/icons \
"
