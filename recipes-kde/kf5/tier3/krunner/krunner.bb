SUMMARY = "Framework for providing different actions given a string query"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://src/abstractrunner.h;endline=18;md5=a6a49d7635ef149bcddf8c46f0eae999"

inherit kde-kf5 gettext

DEPENDS += "qtdeclarative \
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
            threadweaver"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "6852c3f86b436408362ef9a2c9bd3eb9"
SRC_URI[sha256sum] = "aa58b6301de114e7f0a420982f1387dfadac2112aac1339182af18f4f4e7583e"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/kdevappwizard \
    ${datadir}/dbus-1 \
    ${OE_QMAKE_PATH_QML}/org/kde \
"
