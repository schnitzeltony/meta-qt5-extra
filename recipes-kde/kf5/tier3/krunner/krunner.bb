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
SRC_URI[md5sum] = "5077444a3ad810e93b538baad1442163"
SRC_URI[sha256sum] = "6dc1e8be53ef2b1abb2efe0d597d493413989a65bcc914283349161f06327248"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/kdevappwizard \
    ${datadir}/dbus-1 \
    ${OE_QMAKE_PATH_QML}/org/kde \
"
FILES_${PN}-dbg += "${OE_QMAKE_PATH_QML}/org/kde/*/.debug"
