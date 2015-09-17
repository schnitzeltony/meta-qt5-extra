SUMMARY = "Daemon providing a polkit authentication UI for KDE"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

DEPENDS += " \
    ki18n \
    kwindowsystem \
    kdbusaddons \
    kwidgetsaddons \
    kcoreaddons \
    kcrash \
    kconfig \
    kiconthemes \
    knotifications \
    polkit-qt-1 \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "0e27d8c01b108aa709a130466bc56a9a"
SRC_URI[sha256sum] = "5128354ea066140e10b228b27de22ecfad09c39187cba81eb10c4f9e769b21bc"

SRC_URI += "file://0001-fix-build-for-QT_NO_SESSIONMANAGER.patch"

FILES_${PN} += "${datadir}/knotifications5"
