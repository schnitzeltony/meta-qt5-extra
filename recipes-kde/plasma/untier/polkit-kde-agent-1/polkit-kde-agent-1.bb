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
SRC_URI[sha256sum] = "22d08e3989acf9ff92312b754c897d5323c6cf638e2fc12c22439924bce19cae"

FILES:${PN} += " \
    ${datadir}/knotifications5 \
    ${systemd_user_unitdir} \
"
