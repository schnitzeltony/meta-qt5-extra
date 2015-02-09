SUMMARY = "Manages the power consumption settings of a Plasma Shell"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
"

REQUIRED_DISTRO_FEATURES = "x11"

inherit kde-plasma

DEPENDS += " \
    kcoreaddons \
    ki18n \
    kxmlgui \
    kauth \
    kconfigwidgets \
    kio \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "libxcb virtual/xserver", "", d)} \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "c034f85d4b7c124d71243dd3ecbd3d85"
SRC_URI[sha256sum] = "26cd4babb2128f5d9634fba463aa8b3258622e310ed23ab818eaaecf1fc54437"

FILES_${PN} += " \
    ${datadir}/kservices5 \
    ${datadir}/dbus-1 \
    ${datadir}/polkit-1 \
    ${libdir}/plugins \
    ${libdir}/kauth \
"

FILES_${PN}-dbg += " \
    ${libdir}/plugins/.debug \
    ${libdir}/kauth/.debug \
"
