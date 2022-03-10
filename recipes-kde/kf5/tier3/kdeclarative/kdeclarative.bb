SUMMARY = "Provides integration of QML and KDE Frameworks"
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & LGPL-2.0-or-later & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & MIT & Qt-LGPL-exception-1.1"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/GPL-3.0-only.txt;md5=1c76c4cc354acaac30ed4d5eefea7245 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
    file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75 \
    file://LICENSES/Qt-LGPL-exception-1.1.txt;md5=38d22f987f077611a625f5729dd0fd39 \
"

inherit kde-kf5

DEPENDS += " \
    gettext-native \
    kcoreaddons-native \
    kauth-native \
    kpackage-native kpackage \
    kconfig-native kconfig \
    libepoxy  \
    qtdeclarative \
    ki18n \
    kiconthemes \
    kio \
    kwidgetsaddons \
    kwindowsystem \
    kglobalaccel \
    kguiaddons \
"

SRC_URI += " \
    file://0001-kpackagelauncherqml-Add-include-of-QDebug.patch \
"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "ffb8fb0edb1036aa310f1a80344e5a7209cfc9dc1bff086ed458fa0e58716da0"

FILES:${PN} += "${OE_QMAKE_PATH_QML}/org/kde"
