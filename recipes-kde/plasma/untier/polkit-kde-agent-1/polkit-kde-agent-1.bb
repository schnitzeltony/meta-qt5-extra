SUMMARY = "Daemon providing a polkit authentication UI for KDE"
LICENSE = "CC0-1.0 & GPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881 \
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
SRC_URI[sha256sum] = "10112e862879d5e9ea36931cc12ecf0daa4c5220c25d09e67d1b40c10efa121b"

FILES:${PN} += " \
    ${datadir}/knotifications5 \
    ${systemd_user_unitdir} \
"
