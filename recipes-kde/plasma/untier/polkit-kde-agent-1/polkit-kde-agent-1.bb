SUMMARY = "Daemon providing a polkit authentication UI for KDE"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma gettext features_check

REQUIRED_DISTRO_FEATURES = "polkit"

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
SRC_URI[sha256sum] = "b236f87213247a858acb9a7b82dba71f579c3febb3cee189b96584e588a6e251"

FILES_${PN} += " \
    ${datadir}/knotifications5 \
    ${systemd_user_unitdir} \
"
