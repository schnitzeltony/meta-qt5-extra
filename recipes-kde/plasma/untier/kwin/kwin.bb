SUMMARY = "KDE's window manager"
LICENSE = "LGPLv2.1 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

REQUIRED_DISTRO_FEATURES = "x11"

inherit kde-plasma distro_features_check

DEPENDS += " \
    libinput \
    \
    kconfig \
    kconfigwidgets \
    kcoreaddons \
    kcrash \
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
	kwayland \
    kscreenlocker \
"

# this condition matches always currently - it is kept in this way as a marker
DEPENDS += " \
	${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver qtx11extras libepoxy xcb-util-cursor", "",d)} \
"

# REVISIT: PACKAGECONFIG for optionals
DEPENDS += " \
	kactivities \
	kdoctools \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "613586192701ed2a0a08acc4a8d78874"
SRC_URI[sha256sum] = "34b02f5a1ef50390ed90f550e4d15ed806279072a34e7ded2475f32027a8f338"

SRC_URI += " \
    file://0001-fix-build-for-qtbase-without-session-management.patch \
    file://0002-eglonxbackend-add-debug-output.patch \
    file://0003-Make-building-of-QPA-wayland-plugin-an-option.patch \
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

REDEPENDS_${PN} += "qtmultimedia"
