SUMMARY = "Offers available actions for a specific purpose"
LICENSE = "GPL-2.0+ & LGPL-2.0+ & LGPL-2.1+"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
"

inherit kde-kf5 gettext gtk-icon-cache

SRC_URI[sha256sum] = "c5817a400aa531a3e5f5fbdadc4b350cbdc6286f2983a341db0d3b1cd03b248f"

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

FILES:${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML}/org/kde/${BPN} \
"
