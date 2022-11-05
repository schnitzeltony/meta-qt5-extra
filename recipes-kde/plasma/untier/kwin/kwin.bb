SUMMARY = "KDE's window manager"
LICENSE = "BSD-3-Clause & CC0-1.0 & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.0-or-later & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/GPL-3.0-only.txt;md5=1c76c4cc354acaac30ed4d5eefea7245 \
    file://LICENSES/GPL-3.0-or-later.txt;md5=1c76c4cc354acaac30ed4d5eefea7245 \
    file://LICENSES/LGPL-2.0-only.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=41890f71f740302b785c27661123bff5 \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
    file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75 \
"

REQUIRED_DISTRO_FEATURES:class-target = "x11"

# Bad hack to circumvent odd behavior on kwin build and to make
# cmake_extra_sanity.bbclass happy:
# * Files created by qtwaylandscanner have a comment with full path containing
#   sysroot
# * qtwaylandscanner is run twice: during compile and install
#
# => we need a very specific sequence of appends:
# 1. build
# 2. adjust
# 3. check by cmake_extra_sanity.bbclass
inherit cmake_qt5
do_install:append:class-target() {
    cd ${B}/src/wayland
    # Adjust comments to make cmake_extra_sanity.bbclass happy
    for wayland_source in `grep -rl '// source file is ${STAGING_DIR_HOST}'`; do
        sed -i 's:// source file is ${STAGING_DIR_HOST}:// source file is :g' "$wayland_source"
    done
}

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

PV = "${PLASMA_VERSION}.1"
SRC_URI[sha256sum] = "7c9e921226f85c8f8e835b8bf63ae67da800d6921ba148618e570bf4825f3364"

OECMAKE_SOURCEPATH:class-native = "${S}/src/wayland/tools"

# native tools pointers
EXTRA_OECMAKE:append:class-target = " \
    -DKF5_HOST_TOOLING=${STAGING_LIBDIR_NATIVE}/cmake \
    -DCMAKE_SYSROOT=${STAGING_DIR_NATIVE} \
    -DQTWAYLANDSCANNER_KDE_EXECUTABLE=${STAGING_BINDIR_NATIVE}/qtwaylandscanner_kde \
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
