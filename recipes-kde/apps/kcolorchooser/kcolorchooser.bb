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
SRC_URI[md5sum] = "eb34af9c4666d615911a62f1038ea4c3"
SRC_URI[sha256sum] = "fe49f5eeffe806a044c09194d44c335d337ca233e91402f206072cf12e102446"

FILES_${PN} += " \
    ${datadir}/icons \
"
