SUMMARY = "Offers available actions for a specific purpose"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde-kf5 gettext gtk-icon-cache

SRC_URI[md5sum] = "a56a20ee5dda3eb6e133c14203bd975e"
SRC_URI[sha256sum] = "078837cece687455e97d2c3721b95eaa4329e2026d8e0c3f55dbba32f15d4238"

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
