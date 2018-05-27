SUMMARY = "Offers available actions for a specific purpose"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde-kf5 gettext gtk-icon-cache

SRC_URI[md5sum] = "a28a44a1f985e757e911cd90ba2c0d32"
SRC_URI[sha256sum] = "e1cd55712726f9997cf616a36ae880a8f518b405da3b05d3b463418208d73ad7"

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
