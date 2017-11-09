SUMMARY = "Daemon providing a polkit authentication UI for KDE"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma gettext

DEPENDS += " \
    ki18n \
    kwindowsystem \
    kdbusaddons \
    kwidgetsaddons \
    kcoreaddons \
    kcoreaddons-native \
    kcrash \
    kconfig \
    kiconthemes \
    knotifications \
    polkit-qt-1 \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "346056718dd38992895ac74d6bf5baff"
SRC_URI[sha256sum] = "f4ef70ee29b75976035e60b1c6b3b6fe2c1864ce9f59a01ac5bd46af8f810c21"

SRC_URI += "file://0001-fix-build-for-QT_NO_SESSIONMANAGER.patch"

FILES_${PN} += "${datadir}/knotifications5"
