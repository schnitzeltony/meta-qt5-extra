SUMMARY = "Framework for providing different actions given a string query"
LICENSE = "LGPL-2.0+ & LGPL-2.1+"
LIC_FILES_CHKSUM = " \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
"

inherit kde-kf5 gettext

DEPENDS += " \
    qtdeclarative \
    kauth-native \
    kconfig \
    kconfig-native \
    kcoreaddons \
    kcoreaddons-native \
    kpackage-native \
    ki18n \
    kio \
    kservice \
    plasma-framework \
    solid \
    threadweaver \
"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "8dc01236134640daab49dcee77227a11d4582feb58e3c6856ca3e12caf31e4df"

FILES:${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/kdevappwizard \
    ${datadir}/dbus-1 \
    ${OE_QMAKE_PATH_QML}/org/kde \
"
