SUMMARY = "Manages the power consumption settings of a Plasma Shell"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
"

REQUIRED_DISTRO_FEATURES = "x11"

inherit kde-plasma distro_features_check

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
SRC_URI[md5sum] = "9c6fd66fead33335494cb5e1b809cb5d"
SRC_URI[sha256sum] = "d32cf16e254f216f3477460229d5500fd63944630d073c4eec5cde400af5f9de"

FILES_${PN} += " \
    ${datadir}/kservices5 \
    ${datadir}/dbus-1 \
    ${datadir}/polkit-1 \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${libdir}/kauth \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
    ${libdir}/kauth/.debug \
"
