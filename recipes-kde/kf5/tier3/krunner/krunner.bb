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
SRC_URI[md5sum] = "0c8b7c0d5ae8831f24fa940832eaf22a"
SRC_URI[sha256sum] = "1be00fe8847c9e6389ceb95cb077018a8d1380f4f97a1513e6462431b648c51b"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/kdevappwizard \
    ${datadir}/dbus-1 \
    ${OE_QMAKE_PATH_QML}/org/kde \
"
