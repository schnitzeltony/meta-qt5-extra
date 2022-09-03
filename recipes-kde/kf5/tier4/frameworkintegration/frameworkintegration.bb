SUMMARY = "Workspace and cross-framework integration plugins"
LICENSE = "LGPL-2.0-only & LGPL-2.0-or-later & LGPL-3.0-only"
LIC_FILES_CHKSUM = " \
    file://LICENSES/LGPL-2.0-only.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
"

inherit kde-kf5 gettext

DEPENDS += " \
    kauth-native \
    kcoreaddons-native \
    kconfig-native kconfig \
    kpackage-native kpackage \
    kconfigwidgets \
    ki18n \
    kiconthemes \
    kio \
    knotifications \
    kwidgetsaddons \
    knewstuff \
"

RRECCOMENDS_${PN} += "oxygen-fonts"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "3b6822538383ae4a152498c09024c02c03c97742e40a1fe3bdb08eb5ed4332eb"

FILES:${PN} += " \
    ${datadir}/knotifications5 \
    ${datadir}/kconf_update \
    ${OE_QMAKE_PATH_PLUGINS} \
"
