SUMMARY = "QtQuickControls 2 style that integrates with the desktop"
LICENSE = "GPL-2.0 & GPL-2.0+ & GPL-3.0 & LGPL-2.0 & LGPL-3.0"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/GPL-3.0-only.txt;md5=1c76c4cc354acaac30ed4d5eefea7245 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
"

inherit kde-kf5 gettext

DEPENDS += " \
    kconfig-native \
    kcoreaddons-native \
    kauth-native \
    kirigami2 \
    kiconthemes \
    kconfigwidgets \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/libx11 qtx11extras", "", d)} \
"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "bb9736691e19ec72138035f46cb7e1d760b07ee9f8946c421c3b611c3ffe028d"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML} \
"
