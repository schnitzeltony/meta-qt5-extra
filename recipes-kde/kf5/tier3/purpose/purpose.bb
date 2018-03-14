SUMMARY = "Offers available actions for a specific purpose"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde-kf5 gettext gtk-icon-cache

SRC_URI[md5sum] = "7437c88141f862fc165a42bb35bf88ec"
SRC_URI[sha256sum] = "4e3472fd7e494a33d601a99d0afb61e23ef8c8305e2916f70447f3b2d6168ce9"

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
