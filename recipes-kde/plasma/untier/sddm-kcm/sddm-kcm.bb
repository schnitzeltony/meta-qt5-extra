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
SRC_URI[md5sum] = "810f4e9ac4d0b6b6cbd3bfa315742b35"
SRC_URI[sha256sum] = "d058614ad0a759855af4a202c567e424b7bea48581736782c8db44aae783836e"

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
