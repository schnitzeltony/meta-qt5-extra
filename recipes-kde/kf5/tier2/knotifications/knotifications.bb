SUMMARY = "Abstraction for system notifications"
LICENSE = "BSD-3-Clause & LGPL-2.0-only & LGPL-2.0-or-later & LGPL-2.1-only & LGPL-3.0-only"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/LGPL-2.0-only.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
"

inherit kde-kf5

DEPENDS += " \
    kwindowsystem \
    kservice \
    kconfig \
    kconfig-native \
    kiconthemes \
    kcodecs \
    kcoreaddons \
    kcoreaddons-native \
    phonon \
    libdbusmenu-qt5 \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras libxtst", "", d)} \
"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "c8d51ce32b65f096c75da3e7bdb033202086cabaa8faad3bcdd46730b74b43bf"

FILES:${PN} += " \
    ${datadir}/dbus-1 \
    ${datadir}/kservicetypes5 \
    ${OE_QMAKE_PATH_QML} \
"
