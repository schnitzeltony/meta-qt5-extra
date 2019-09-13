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
SRC_URI[md5sum] = "affed5eb5f8f6d866df842892c66154e"
SRC_URI[sha256sum] = "a36cccbbf5dda16c0d97bff2ce415e678481fee5c2a7640b2c2db2f0ea7c70cb"

FILES_${PN} += " \
    ${datadir}/icons \
"
