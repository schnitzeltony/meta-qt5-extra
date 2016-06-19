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
SRC_URI[md5sum] = "ff844df8d38596734e541a0c53131e32"
SRC_URI[sha256sum] = "80294a22cd6c2eb4765bbce236f5a7b74a90c59481d8d4428c7addd9c96b2807"

SRC_URI += "file://0001-Revert-Don-t-import-an-nonexistent-layout.patch"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5Plasma, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Plasma, -S${includedir}, -S${STAGING_INCDIR}"

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
