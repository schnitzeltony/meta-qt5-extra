SUMMARY = "KINFOCENTER"
# Have no idea how kinfocenter is licensed now (and change came in with minor
# point release !!)
# [1] https://cgit.kde.org/kinfocenter.git/commit/?id=4ea9df96ae038f28f3e9f6ecef6a64681bb3e189
LICENSE = "BSD-2-Clause & BSD-3-Clause & CC0-1.0 & FSFAP & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & LGPL-2.0-or-later & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-2-Clause.txt;md5=4e290b17e3e05732730de37b44abef90 \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/FSFAP.txt;md5=232368338ef6dc99de71c2e05ff12176 \
    file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/GPL-3.0-only.txt;md5=1c76c4cc354acaac30ed4d5eefea7245 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
"

inherit kde-plasma gettext

DEPENDS += " \
    pciutils \
    kcompletion \
    kauth-native \
    kconfig \
    kconfig-native \
    kconfigwidgets \
    kcoreaddons \
    kcoreaddons-native \
    kdbusaddons \
    kdoctools \
    kdoctools-native \
    ki18n \
    kiconthemes \
    kcmutils \
    kpackage-native \
    sonnet-native \
    kio \
    kservice \
    solid \
    kwidgetsaddons \
    kxmlgui \
"

# REVISIT optionals
DEPENDS += "${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/libx11", "", d)}"

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "e12f892612a4be07945b85df90463f7e0c36d24159393d4f60279aa97605c904"
SRC_URI += "file://0001-fix-build-in-x11-less-environments.patch"

FILES:${PN} += " \
    ${datadir}/kcmusb \
    ${datadir}/desktop-directories \
    ${datadir}/k*5 \
    ${datadir}/kpackage \
    \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML} \
"
