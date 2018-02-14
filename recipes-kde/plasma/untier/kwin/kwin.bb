SUMMARY = "KDE's window manager"
LICENSE = "LGPLv2.1 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

REQUIRED_DISTRO_FEATURES = "x11"

inherit kde-plasma distro_features_check gettext

DEPENDS += " \
    libinput \
    qtsensors \
    \
    kauth-native \
    kconfig \
    kconfig-native \
    kconfigwidgets \
    kcoreaddons \
    kcoreaddons-native \
    kcrash \
    kglobalaccel \
    ki18n \
    kinit \
    knotifications \
    kpackage \
    kpackage-native \
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
    sonnet-native \
"

# this condition matches always currently - it is kept in this way as a marker
DEPENDS += " \
	${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/libx11 qtx11extras libepoxy xcb-util-cursor", "",d)} \
"

# REVISIT: PACKAGECONFIG for optionals
DEPENDS += " \
    kactivities \
    kdoctools \
    kdoctools-native \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "5983d1f2b35d66252fc9b2c47c7d2ddb"
SRC_URI[sha256sum] = "de5513fe9d13c7e17dc32f767699f8c7ce656a3eb3fb1dda22665a0b3dc48d8f"

SRC_URI += " \
    file://0001-fix-build-for-qtbase-without-session-management.patch \
    file://0002-Make-building-of-QPA-wayland-plugin-an-option.patch \
"

# pure X11 environments fail to build wayland plugin
EXTRA_OECMAKE += "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', '-DKWIN_BUILD_QPA=ON', '-DKWIN_BUILD_QPA=OFF', d)}"

# kwin check libepoxy only -> egl pkgconfig is skipped
CXXFLAGS_append_mx6 += " -DLINUX=1"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/kservices5 \
    ${datadir}/kwincompositing \
    ${datadir}/dbus-1 \
    ${datadir}/icons \
    ${datadir}/*5 \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML} \
    ${libdir}/kconf_update_bin \
"

# taken from bitbake.conf with lucky modification: all lt libraries end with s.so
# only move them to -dev package
FILES_SOLIBSDEV = "${base_libdir}/lib*${SOLIBSDEV} ${libdir}/lib*s${SOLIBSDEV}"
FILES_${PN} += " \
    ${libdir}/*.so \
"

FILES_${PN}-dbg += " \
    ${libdir}/*/.debug \
    ${libdir}/*/*/.debug \
    ${libdir}/*/*/*/.debug \
    ${libdir}/*/*/*/*/.debug \
    ${libdir}/*/*/*/*/*/.debug \
    ${libdir}/*/*/*/*/*/*/.debug \
    ${libdir}/*/*/*/*/*/*/*/.debug \
"

RDEPENDS_${PN} += " \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11 wayland", "xserver-xorg-xwayland", "",d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "wayland", "qtwayland", "",d)} \
    qtmultimedia \
    qtvirtualkeyboard-qmlplugins \
"
