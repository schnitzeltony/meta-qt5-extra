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
SRC_URI[md5sum] = "18b4b6c055de39628be87863e62dd893"
SRC_URI[sha256sum] = "c6bfdcbd0f751a00a44df371d43e3986156c41e02a05fb7a1e30c5cf8e299b2f"

SRC_URI += "file://0001-fix-build-for-QT_NO_SESSIONMANAGER.patch"

FILES_${PN} += "${datadir}/knotifications5"
