SUMMARY = "Offers available actions for a specific purpose"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde-kf5 gettext gtk-icon-cache

SRC_URI[md5sum] = "7709474d48e375a9b6f127b05247a06e"
SRC_URI[sha256sum] = "882aa64c55e134d1aff06d533f8c3c6f8e5886b5b782925e1aad2e0ca7e37e67"

PV = "${KF5_VERSION}"

DEPENDS += " \
    qtdeclarative \
    kcoreaddons-native kcoreaddons \
    ki18n-native ki18n \
    kconfig-native kconfig \
    kio \
    kauth-native \
"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML}/org/kde/${BPN} \
"
