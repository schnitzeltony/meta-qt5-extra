SUMMARY = "Support for downloading application assets from the network"
LICENSE = "GPL-2.0-only & GPL-3.0-only & LGPL-2.0-or-later & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977 \
    file://LICENSES/GPL-3.0-only.txt;md5=1c76c4cc354acaac30ed4d5eefea7245 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
"

inherit kde-kf5 gettext

DEPENDS += " \
    kauth-native \
    kcoreaddons-native \
    sonnet-native \
    kconfig-native kconfig \
    kpackage-native kpackage \
    karchive \
    kcompletion \
    kcoreaddons \
    ki18n \
    kiconthemes \
    kio \
    kitemviews \
    ktextwidgets \
    kwidgetsaddons \
    kxmlgui \
    attica \
    kirigami2 \
    syndication \
"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "4b14aee55d7701c72d05030fad508a5cb89fee34656d4d84c2d977a3c2a66c3f"

FILES:${PN} += " \
    ${OE_QMAKE_PATH_QML}/org/kde/newstuff \
"
