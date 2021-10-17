SUMMARY = "KSE sysguard library"
LICENSE = "GPL-2.0 & LGPL-2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-plasma gettext

DEPENDS += " \
    qtwebengine \
    qtwebchannel \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kpackage-native \
    kdesignerplugin-native \
    kcoreaddons \
    kconfig \
    ki18n \
    kjobwidgets \
    kwindowsystem \
    kcompletion \
    kwidgetsaddons \
    kiconthemes \
    kconfigwidgets \
    kservice \
    kglobalaccel \
    kio \
    kdeclarative \
    knewstuff \
    zlib \
    libnl \
    libpcap \
    libcap \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/libx11 qtx11extras libxres", "", d)} \
"

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "c379dc3e806085ec058e7633153d697ab8868aa6eac1f483931f75f2fcdd61eb"

FILES:${PN} += " \
    ${datadir}/dbus-1 \
    ${datadir}/polkit-1 \
    ${datadir}/ksysguard \
    ${datadir}/knsrcfiles \
    ${OE_QMAKE_PATH_QML} \
    ${OE_QMAKE_PATH_PLUGINS} \
"
