SUMMARY = "Widgets for configuration dialog"
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-2.0-only & LGPL-2.0-or-later & LGPL-2.1-only & LGPL-3.0-only & MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/LGPL-2.0-only.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
    file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75 \
"

inherit kde-kf5

DEPENDS += " \
    gettext-native \
    kcoreaddons-native \
    kdesignerplugin-native \
    kauth-native kauth \
    kconfig-native kconfig \
    kdoctools-native kdoctools \
    kcodecs \
    kguiaddons \
    kwidgetsaddons \
"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "35055f637ff44b0f0e67f9b5c79307d37f5c259289bf71b2a24c0203f82fb508"

FILES:${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"

RDEPENDS:${PN} += "perl"
