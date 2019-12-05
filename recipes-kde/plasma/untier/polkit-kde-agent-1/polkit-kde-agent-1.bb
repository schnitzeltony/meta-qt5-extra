SUMMARY = "Daemon providing a polkit authentication UI for KDE"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma gettext distro_features_check

REQUIRED_DISTRO_FEATURE = "polkit"

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
SRC_URI[md5sum] = "a4c9010293b74e515b54d8a07214c85f"
SRC_URI[sha256sum] = "042677cab65ab4c51632398bb9b3204cd09cef5bb4648949a7a3914bba4c6d49"

SRC_URI += "file://0001-fix-build-for-QT_NO_SESSIONMANAGER.patch"

FILES_${PN} += "${datadir}/knotifications5"
