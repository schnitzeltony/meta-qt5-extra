SUMMARY = "Offers available actions for a specific purpose"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde-kf5 gettext gtk-icon-cache

SRC_URI[md5sum] = "a18698d5cc2ec7763de364f9f5aa2bc1"
SRC_URI[sha256sum] = "0e59f96272a81340914345599f231af839a23d311f770a2536aaa51f46f885d5"

PV = "${KF5_VERSION}"

DEPENDS += " \
    qtdeclarative \
    kauth-native \
    kcoreaddons-native kcoreaddons \
    ki18n-native ki18n \
    kconfig-native kconfig \
    kio \
    kirigami2 \
"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML}/org/kde/${BPN} \
"
