SUMMARY = "Offers available actions for a specific purpose"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde-kf5 gettext gtk-icon-cache

SRC_URI[md5sum] = "8221fcfcc420213297f1ad8548f9051e"
SRC_URI[sha256sum] = "33b8ec6ede6a1deee6c85e45ebe42aca9a3add7884ee68aa8f1a16ed0637b4db"

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
