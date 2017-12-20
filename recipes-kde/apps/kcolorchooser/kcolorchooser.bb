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
SRC_URI[md5sum] = "a282d2b67c7f71e393ba053d518bc099"
SRC_URI[sha256sum] = "8b5adeb5370744073e61923c5d1c9a46337159d406d6de608f694ddc1cb0599d"

FILES_${PN} += " \
    ${datadir}/icons \
"
