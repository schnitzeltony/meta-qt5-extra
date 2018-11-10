SUMMARY = "Offers available actions for a specific purpose"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde-kf5 gettext gtk-icon-cache

SRC_URI[md5sum] = "c8e28239fdf7331cc50b7fbf380635b6"
SRC_URI[sha256sum] = "5637d61fd6c75fac212789967ae927f30f802789e3d207d2da28d5124423e261"

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
