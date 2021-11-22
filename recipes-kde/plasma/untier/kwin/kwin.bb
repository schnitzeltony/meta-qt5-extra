SUMMARY = "KDE's window manager"
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0 & GPL-2.0+ & GPL-3.0 & GPL-3.0+ & LGPL-2.0 & LGPL-2.0+ & LGPL-2.1 & LGPL-3.0"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-2-Clause.txt;md5=63d6ee386b8aaba70b1bf15a79ca50f2 \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/GPL-3.0-only.txt;md5=1c76c4cc354acaac30ed4d5eefea7245 \
    file://LICENSES/GPL-3.0-or-later.txt;md5=1c76c4cc354acaac30ed4d5eefea7245 \
    file://LICENSES/LGPL-2.0-only.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
"

REQUIRED_DISTRO_FEATURES = "x11"

inherit kde-plasma features_check gettext

DEPENDS += " \
    qtwayland-native \
    libinput \
    qtsensors \
    fontconfig \
    \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kdoctools-native \
    kpackage-native \
    sonnet-native \
    kactivities \
    kconfig \
    kconfigwidgets \
    kcoreaddons \
    kcrash \
    kdoctools \
    kglobalaccel \
    ki18n \
    kinit \
    knotifications \
    kpackage \
    kservice \
    plasma-framework \
    kwidgetsaddons \
    kwindowsystem \
    kiconthemes \
    kidletime \
    kcompletion \
    kdeclarative \
    kcmutils \
    kio \
    knewstuff \
    kxmlgui \
    kdecoration \
    kscreenlocker \
    kwayland-server \
"

# this condition matches always currently - it is kept in this way as a marker
DEPENDS += "${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/libx11 qtx11extras libepoxy xcb-util-cursor", "",d)}"

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "7fb1daac298d1198f3c45b38d3b58219f72dbb7fcb11176478a9fd3cbedd8813"

FILES:${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/dbus-1 \
    ${datadir}/kconf_update \
    ${datadir}/k*5 \
    ${datadir}/knsrcfiles \
    ${datadir}/kpackage \
    ${datadir}/icons \
    ${systemd_user_unitdir} \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML} \
    ${libdir}/kconf_update_bin \
"

# taken from bitbake.conf with lucky modification: all lt libraries end with s.so
# only move them to -dev package
FILES_SOLIBSDEV = "${base_libdir}/lib*${SOLIBSDEV} ${libdir}/lib*s${SOLIBSDEV}"
FILES:${PN} += " \
    ${libdir}/*.so \
"

RDEPENDS:${PN} += " \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11 wayland", "xwayland", "",d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "wayland", "qtwayland", "",d)} \
    qtmultimedia \
    qtvirtualkeyboard-qmlplugins \
    perl \
"
