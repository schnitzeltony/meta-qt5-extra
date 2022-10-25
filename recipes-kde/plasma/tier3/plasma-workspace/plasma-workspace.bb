SUMMARY = "Plasma workspace, applications and applets"
LICENSE = "BSD-2-Clause & BSD-3-Clause & CC0-1.0 & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & LGPL-2.0-only & LGPL-2.0-or-later & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-2-Clause.txt;md5=4e290b17e3e05732730de37b44abef90 \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/GPL-2.0-only.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/GPL-3.0-only.txt;md5=49fc03046e56a282c0c743b5d3a55b7c \
    file://LICENSES/LGPL-2.0-only.txt;md5=da48810c4ddf8e49efa031294a26b98c \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=da48810c4ddf8e49efa031294a26b98c \
    file://LICENSES/LGPL-2.1-only.txt;md5=147a320ed8b16b036829a0c71d424153 \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=147a320ed8b16b036829a0c71d424153 \
    file://LICENSES/LGPL-3.0-only.txt;md5=8d51f5b5fd447f7a1040c3dc9f0a8de6 \
    file://LICENSES/MIT.txt;md5=4dd71a82d66fd9e3ca0cc65b8be370c0 \
"

REQUIRED_DISTRO_FEATURES = "x11"

inherit kde-plasma features_check gettext gtk-icon-cache mime-xdg qmake5_paths

DEPENDS += " \
    qtwayland-native \
    kpackage-native \
    kdoctools-native \
    sonnet-native \
    kdesignerplugin-native \
    kcmutils-native \
    kauth-native \
    libqalculate \
    baloo \
    kdeclarative \
    plasma-framework \
    kconfig \
    kactivities \
    krunner \
    kjsembed \
    kholidays \
    knotifyconfig \
    kdesu \
    knewstuff \
    kwallet \
    kidletime \
    kdeclarative \
    ktextwidgets \
    ktexteditor \
    kxmlrpcclient \
    kcrash \
    prison \
    networkmanager-qt \
    libksysguard \
    libkscreen \
    kunitconversion \
    kded \
    kwin \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/libx11 libsm libxcb", "", d)} \
    zlib \
    kpeople \
    kactivities-stats \
"

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "dc0709d9e99784e46e921b2b5e213b919887512ac1d8e0be46f77f8ba00a8f66"
SRC_URI += "file://0001-Make-qdbus-bindir-configurable.patch"

EXTRA_OECMAKE += " \
    -DBUILD_TESTING=OFF \
    -DQtBinariesDir=${OE_QMAKE_PATH_QT_BINS} \
"

# REVISIT
FILES:${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/dbus-1 \
    ${datadir}/desktop-directories \
    ${datadir}/k* \
    ${datadir}/plasma \
    ${datadir}/polkit-1 \
    ${datadir}/sddm \
    ${datadir}/solid \
    ${datadir}/wayland-sessions \
    ${datadir}/xsessions \
    \
    ${libdir}/libkdeinit5*.so \
    ${libdir}/libkrdb.so \
    ${libdir}/kconf_update_bin \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML} \
    ${systemd_user_unitdir} \
"

FILES_SOLIBSDEV = " \
    ${libdir}/libcolorcorrect${SOLIBSDEV} \
    ${libdir}/libkworkspace5${SOLIBSDEV} \
    ${libdir}/libnotificationmanager${SOLIBSDEV} \
    ${libdir}/libplasma-geolocation-interface${SOLIBSDEV} \
    ${libdir}/libtaskmanager${SOLIBSDEV} \
    ${libdir}/libweather_ion${SOLIBSDEV} \
    ${libdir}/libkfontinst*${SOLIBSDEV} \
"
INSANE_SKIP:${PN} = "dev-so"

# startkde/startplasmacompositor require:
RDEPENDS:${PN} += " \
    kconfig-bin \
    kded \
    kinit \
    kwin \
    plasma-workspace-wallpapers \
    qttools-tools \
    xinit \
    xset \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "xsetroot xmessage xprop", "", d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11 wayland", "xwayland", "", d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "wayland", "qtwayland-plugins", "", d)} \
"
