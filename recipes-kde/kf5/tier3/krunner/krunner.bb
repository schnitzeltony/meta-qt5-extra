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
SRC_URI[md5sum] = "924b94d590a560281d787bab1f4de21e"
SRC_URI[sha256sum] = "40f52d4d883748f5b9a78b5bd7dd6aaa52eae88b89d7a33eafbcbb9ccf6f4805"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/kdevappwizard \
    ${datadir}/dbus-1 \
    ${OE_QMAKE_PATH_QML}/org/kde \
"
