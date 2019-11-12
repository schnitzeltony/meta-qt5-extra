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
SRC_URI[md5sum] = "8c14dfc8c4f2895a27b854a71d5bd992"
SRC_URI[sha256sum] = "0c3d45ceb9029f0d316e61b3f403838b4c7de82a3211a231b539e6755386c657"

FILES_${PN} += " \
    ${datadir}/icons \
"
