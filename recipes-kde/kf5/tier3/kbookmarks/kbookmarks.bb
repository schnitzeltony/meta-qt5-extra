SUMMARY = "Support for bookmarks and the XBEL format"
LICENSE = "GPL-2.0-or-later & LGPL-2.0-only & LGPL-2.0-or-later & LGPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/LGPL-2.0-only.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
"

inherit kde-kf5

DEPENDS += " \
    kcoreaddons-native \
    kauth-native \
    kconfig-native kconfig \
    kconfigwidgets \
    kiconthemes \
    kxmlgui  \
"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "776dac6741d15dd02593891ad1b5d9ca3598df5edb3d431ed9e8c1386ae16b6a"
