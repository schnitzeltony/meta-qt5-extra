SUMMARY = "Framework for providing different actions given a string query"
LICENSE = "LGPLv2.0+ & LGPLv2.1+"
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
SRC_URI[sha256sum] = "08c8addcdd3dac87472e84bd14c6d02b99f98c5efbbda7802de92286105dcdda"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/kdevappwizard \
    ${datadir}/dbus-1 \
    ${OE_QMAKE_PATH_QML}/org/kde \
"
