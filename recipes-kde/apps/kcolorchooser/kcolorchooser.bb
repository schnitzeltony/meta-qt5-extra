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
SRC_URI[md5sum] = "5cc3b93dc8edce41b65c0cb8748344f1"
SRC_URI[sha256sum] = "0fa7493844bc72623d20dee6ac10123254a934d8751338d27079ac4a370c5d43"

FILES_${PN} += " \
    ${datadir}/icons \
"
