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
SRC_URI[md5sum] = "9da490e8e8ccfed43206d18a176019f8"
SRC_URI[sha256sum] = "8c043d45389a09cd813a7a4d6ce1bd298063270f099a5431342fb7467e16bff3"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/kdevappwizard \
    ${datadir}/dbus-1 \
    ${OE_QMAKE_PATH_QML}/org/kde \
"
