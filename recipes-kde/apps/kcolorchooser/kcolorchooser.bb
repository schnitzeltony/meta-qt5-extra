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
SRC_URI[md5sum] = "91f2928c4c67b49ce362f301f0e7d0bd"
SRC_URI[sha256sum] = "29e7fdf9a57c827d0ab05f10a905c6c483323711bb385d1c262e792950bd5f4a"

FILES_${PN} += " \
    ${datadir}/icons \
"
