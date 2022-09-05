SUMMARY = "KDE's window manager"
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.0-or-later & LGPL-2.1-only & LGPL-3.0-only"
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

REQUIRED_DISTRO_FEATURES:class-target = "x11"

inherit kde-plasma features_check gettext

DEPENDS:remove:class-native = "kwayland-native"
DEPENDS:append:class-target = " \
    ${BPN}-native \
    qtwayland-native \
    kauth-native \
    kconfig-native kconfig \
    kdoctools-native \
    kcoreaddons-native kcoreaddons \
    kpackage-native kpackage \
    kcmutils-native \
    sonnet-native \
    \
    libxcvt \
    libinput \
    qtsensors \
    fontconfig \
    lcms \
    \
    breeze \
    kactivities \
    kconfigwidgets \
    kcrash \
    kglobalaccel \
    ki18n \
    kinit \
    knotifications \
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
    krunner \
"

# this condition matches always currently - it is kept in this way as a marker
DEPENDS:append:class-target = "${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/libx11 qtx11extras libepoxy xcb-util-cursor", "",d)}"

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "e8a6121c000bdf4ade742ebd9b981485ef0481d99b3e1f8d2ae7bcd1e0e1507d"

OECMAKE_SOURCEPATH:class-native = "${S}/src/wayland/tools"

# native tools pointers
EXTRA_OECMAKE:append:class-target = " \
    -DKF5_HOST_TOOLING=${STAGING_LIBDIR_NATIVE}/cmake \
    -DCMAKE_SYSROOT=${STAGING_DIR_NATIVE} \
    -DQTWAYLANDSCANNER_KDE_EXECUTABLE=${STAGING_LIBDIR_NATIVE}/qtwaylandscanner_kde \
"

do_install:class-native() {
    install -d ${D}${bindir}
    install -m 755 ${B}/qtwaylandscanner_kde ${D}${bindir}/$destname
}

FILES:${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/dbus-1 \
    ${datadir}/kconf_update \
    ${datadir}/k*5 \
    ${datadir}/knsrcfiles \
    ${datadir}/kpackage \
    ${datadir}/krunner \
    ${datadir}/icons \
    ${systemd_user_unitdir} \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML} \
    ${libdir}/kconf_update_bin \
"

RDEPENDS:${PN}:class-target += " \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11 wayland", "xwayland", "",d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "wayland", "qtwayland", "",d)} \
    qtmultimedia \
    qtvirtualkeyboard-qmlplugins \
    perl \
"

BBCLASSEXTEND = "native"
