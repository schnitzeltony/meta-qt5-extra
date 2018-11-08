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
SRC_URI[md5sum] = "1b148b4c893666a8022ed6b2678ea3b7"
SRC_URI[sha256sum] = "7c152ab0f43cc5e049d69c0d2962c696bad8c641072ab47c2d351da956e51b17"

SRC_URI += "file://0001-fix-build-for-QT_NO_SESSIONMANAGER.patch"

FILES_${PN} += "${datadir}/knotifications5"
