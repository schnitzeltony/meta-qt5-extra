SUMMARY = "GUI to monitor system sensors, process information and other resources"
LICENSE = "BSD-3-Clause & CC0-1.0 & GPL-2.0-only & GPL-3.0-only & LGPL-2.0-or-later & LGPL-2.1-only & LGPL-3.0-only & LGPL-3.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/CC0-1.0.txt;md5=6fd064768b8d61c31ddd0540570fbd33 \
    file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977 \
    file://LICENSES/GPL-3.0-only.txt;md5=1c76c4cc354acaac30ed4d5eefea7245 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
    file://LICENSES/LGPL-3.0-or-later.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
"

inherit kde-plasma gettext

DEPENDS += " \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kpackage-native \
    ki18n \
    kconfig \
    kdeclarative \
    kservice \
    kglobalaccel \
    kdbusaddons \
    knewstuff \
    kitemmodels \
    kirigami2 \
    libksysguard \
"

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "46920a4068fb0986d3fe2a2f4467eb37b3938a1b921e618835d4dc8065cddcf8"

FILES:${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/ksysguard \
    ${datadir}/knsrcfiles \
    ${datadir}/plasma \
    ${OE_QMAKE_PATH_QML} \
"

RDEPENDS:${PN} += "ksystemstats"
