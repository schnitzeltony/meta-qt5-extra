SUMMARY = "Plugin based UI runtime used to write primary user interfaces"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += " \
    qtdeclarative \
    qtsvg \
    qtscript \
    kactivities \
    karchive \
    kconfig \
    kconfigwidgets \
    kcoreaddons \
    kdbusaddons \
    kdeclarative \
    kdoctools \
    kglobalaccel \
    kguiaddons \
    ki18n \
    kservice \
    kwindowsystem \
    kxmlgui \
    knotifications \
    kpackage \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver qtx11extras", "", d)} \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "0e8c690beeec8da3b9ae9f45ca5c1942"
SRC_URI[sha256sum] = "35345ced57cce80e1089b3172edfd277a0dc5ed4148b9c52a18c2ca0869eb364"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5Plasma, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5Plasma, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/dbus-1 \
    ${datadir}/plasma \
    \
    ${libdir}/plugins \
    ${libdir}/platformqml \
    ${libdir}/qml \
    ${libdir}/org/kde/plasma \
"

FILES_${PN}-dbg += " \
    ${libdir}/plugins/.debug \
    ${libdir}/plugins/kf5/*/.debug \
    ${libdir}/platformqml/*/org/kde/plasma/*/.debug \
    ${libdir}/org/kde/plasma/*/.debug \
    ${libdir}/qml/org/kde/plasma/*/.debug \
"
