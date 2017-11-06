SUMMARY = "Plugin based UI runtime used to write primary user interfaces"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gettext

DEPENDS += " \
    qtdeclarative \
    qtsvg \
    qtscript \
    kactivities \
    karchive \
    kconfig \
    kconfig-native \
    kconfigwidgets \
    kcoreaddons \
    kcoreaddons-native \
    kdbusaddons \
    kdeclarative \
    kdoctools \
    kdoctools-native \
    kglobalaccel \
    kguiaddons \
    ki18n \
    kservice \
    kwindowsystem \
    kxmlgui \
    knotifications \
    kpackage \
    kpackage-native \
    kwayland \
    kauth-native \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver qtx11extras", "", d)} \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "7595b5162086dd790747e36af49663ea"
SRC_URI[sha256sum] = "a38f92df010d063a934a04d181c30bcac40df5f0494cfc1268d453fe6b9a5dbd"

FILES_${PN} += " \
    ${datadir}/kdevappwizard \
    ${datadir}/dbus-1 \
    ${datadir}/k*5 \
    ${datadir}/plasma \
    \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${libdir}/platformqml \
    ${OE_QMAKE_PATH_QML} \
    ${libdir}/org/kde/plasma \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
    ${OE_QMAKE_PATH_PLUGINS}/*/*/.debug \
    ${libdir}/platformqml/*/org/kde/plasma/*/.debug \
    ${libdir}/org/kde/plasma/*/.debug \
    ${OE_QMAKE_PATH_QML}/org/kde/plasma/*/.debug \
"
